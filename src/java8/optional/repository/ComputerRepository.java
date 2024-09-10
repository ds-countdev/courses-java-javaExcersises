package java8.optional.repository;

import java8.models.Computer;
import java8.models.Processor;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ComputerRepository implements Repository<Computer> {

    private List<Computer> datasource;

    public ComputerRepository(){
        datasource = Arrays.asList(
                new Computer("Asus ROG", "Strix G512", new Processor("hs34","AMD")),
                new Computer("Macbook Pro", "MVVK2CI", new Processor("ht5t60","Intel"))
        );
    }
    @Override
    public Optional<Computer> find(String name) {
        return datasource.stream().filter(computer ->
                computer.getName().toLowerCase().contains(name.toLowerCase())).findFirst();
    }
}
