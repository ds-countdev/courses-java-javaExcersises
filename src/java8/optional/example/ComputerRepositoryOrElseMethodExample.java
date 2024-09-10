package java8.optional.example;

import java8.optional.repository.ComputerRepository;

public class ComputerRepositoryOrElseMethodExample {
    public static void main(String[] args) {

        var computerRepository = new ComputerRepository();

        var computer = computerRepository.find("Asus");

        computer.ifPresentOrElse(System.out::println, ()-> System.out.println("Is not found"));
    }
}
