package java8.optional.example;

import java8.models.Computer;
import java8.models.Processor;
import java8.optional.repository.ComputerRepository;

import java.util.Optional;

public class ComputerRepositoryFilterMapExample {

    public static void main(String[] args) {


        var computerRepository = new ComputerRepository();

        var value = computerRepository.find("Asus")
                .map(Computer::getProcessor)
                .map(Processor::getManufacturer)
                .orElseThrow(IllegalArgumentException::new);

        System.out.println("value = " + value);

    }
}
