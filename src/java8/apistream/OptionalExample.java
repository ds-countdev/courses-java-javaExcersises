package java8.apistream;

import java8.models.User;

import java.util.stream.Stream;

public class OptionalExample {

    public static void main(String[] args) {

        var filterName = Stream.of("Diego Rodriguez", "Alejandro Solano", "Maria Red", "Noemi Arantxa", "Elvira Perez")
                .map(fullName -> new User(fullName.split(" ")[0],fullName.split(" ")[1]))
                .filter(user -> user.getName().equalsIgnoreCase("Diego") )
                .findFirst();

        System.out.println(filterName.orElseGet( () -> new User("diego","alejandro")));
        System.out.println(filterName.orElse(new User("diego","alejandro")));
    }
}
