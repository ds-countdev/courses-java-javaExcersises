package java8.optional.example;

import java8.models.Computer;
import java8.models.Processor;
import java8.optional.repository.ComputerRepository;

import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.IntStream;

public class ComputerRepositoryExample {
    public static void main(String[] args) {

        var computerRepository = new ComputerRepository();
        // orElse is not usefully if you use methods in side
        var computer = computerRepository.find("Asus").orElse(new Computer("Toshiba","ThinkPad",new Processor("S500", "Intel")));
        AtomicReference<String> model = new AtomicReference<>("");
        var computerTwo = computerRepository.find("Hello").orElseGet(() -> new Computer("Dell", "x230",new Processor("h234","AMD")));
        System.out.println("computerTwo = " + computerTwo);
        System.out.println("computer = " + computer);
    }
}
