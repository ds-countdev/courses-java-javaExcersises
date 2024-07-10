package java8.apistream;

import java8.models.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class StreamAnyMatchExample {
    public static void main(String[] args) {

        var singleUser = Stream.of("Diego Rodriguez", "Diego Solano", "Alejandro Solano", "Maria Carrillo", "Pedro Rojas")
                .map(name -> new User(name.split(" ")[0], name.split(" ")[1]))
                .filter(name -> name.getName().equalsIgnoreCase("Diego"))
                .peek(System.out::println)
                .count();
        System.out.println("singleUser = " + singleUser);

        System.out.println("///////////////////////////");
        var userSet = new HashSet<>(List.of(
                new User("Diego","Rodriguez"),
                new User("Tania","Parades"),
                new User("Patricia","Rodriguez"),
                new User("Maria","Rico")));

        userSet.forEach(user -> System.out.println(user.getId()));

    }

    public <T> String doSomething(T... objects){
        return null;
    }
}
