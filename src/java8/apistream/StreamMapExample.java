package java8.apistream;

import java8.models.User;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMapExample {
    public static void main(String[] args) {

        var setNames = new HashSet<String>(List.of("Diego","Daniela","Maria","Alejandro","Diego"));
        setNames.forEach(System.out::println);

        var setName = Stream.of("Diego","Daniela", "Danna", "Diana","Diego")
                .map(String::toUpperCase)
                .peek(System.out::println)
                .map(String::toLowerCase)
                .collect(Collectors.toSet());

        System.out.println("Map part 2////////////////////////");
        var setMapNames = Stream.of("Diego Rodriguez","Alejandro Solano","Maria Vega","Pedro Doe")
                .map(name -> new User(name.split(" ")[0],name.split(" ")[1]))
                .peek(System.out::println)
                .map(user -> {
                    var name = user.getName().toUpperCase();
                    var surname = user.getSurName().toUpperCase();
                    user.setName(name);
                    user.setSurName(surname);
                    return user;
                });

        setMapNames.forEach(System.out::println);




    }

    public <T> String doSomething(T... objects){
        return null;
    }
}
