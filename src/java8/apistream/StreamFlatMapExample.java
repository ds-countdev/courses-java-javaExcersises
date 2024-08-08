package java8.apistream;

import java8.models.User;

import java.util.stream.Stream;

public class StreamFlatMapExample {

    public static void main(String[] args) {

        var result = Stream.of("Diego Rodriguez","Alejandro Solano","Diana Angel","Diego Soto")
                .map(name -> new User(name.split(" ")[0],name.split(" ")[1]))
                //.filter(name -> name.getName().equalsIgnoreCase("Diego"))
                .flatMap(user -> {
                    if (user.getName().equalsIgnoreCase("Diego")) return Stream.of(user);
                    return Stream.empty();
                })
                .peek(System.out::println)
                .count();

        System.out.println("result = " + result);
    }
}
