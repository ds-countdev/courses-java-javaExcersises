package java8.apistream;

import java8.models.User;

import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamSingleFilterExample {
    public static void main(String[] args) {

       var singleUser = Stream.of("Diego Rodriguez","Diego Solano", "Alejandro Solano","Maria Carrillo", "Pedro Rojas")
               .map(name -> new User(name.split(" ")[0],name.split(" ")[1]))
               .filter(name -> name.getName().equalsIgnoreCase("Diego"))
               .peek(System.out::println)
               .findFirst().get();

        var getUserId = Stream.of("Diego Rodriguez","Diego Solano", "Alejandro Solano","Maria Carrillo", "Pedro Rojas")
                .map(name -> new User(name.split(" ")[0],name.split(" ")[1]))
                .peek(user -> System.out.println(user.getId()))
                .filter(user -> user.getId() == 2)
                .peek(System.out::println)
                .findFirst();
        System.out.println(singleUser);
        System.out.println("User = " + getUserId);
    }

    public <T> T doSomething(T... objects){
        return null;
    }
}
