package java8.optional.example;

import java8.optional.repository.ComputerRepository;

import java.util.Optional;

public class ComputerRepositoryOrElseThrowExample {

    public static void main(String[] args) {


        var computerRepository = new ComputerRepository();

        computerRepository.find("Asus").orElseThrow(IllegalArgumentException::new);

        var fileType = Optional.of("Diego.png")
                .filter(file -> file.contains("."))
                .map(type -> type.split("\\.")[1])
                .orElseThrow(IllegalArgumentException::new);

        System.out.println("fileType = " + fileType);

        
    }
}
