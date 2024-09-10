package java8.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {

        var name = "Diego";
        var optional = Optional.of(name);

        System.out.println("optional = " + optional);
        optional.ifPresent(value -> System.out.println("Hello : " + value));
        optional.ifPresentOrElse(nameOptional-> System.out.println("Hello "+ nameOptional), ()-> System.out.println("Is empty") );
        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());

        var optionalNotNull = Optional.ofNullable(null);
        optional.ifPresent(value -> System.out.println("Hello "+ optionalNotNull));
    }
}
