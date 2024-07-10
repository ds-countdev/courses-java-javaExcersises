package java8.functionalInterfaces;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public class FunctionExample {
    public static void main(String[] args) {

        Function<String, String> function = value -> "Hello " +value;
        System.out.println(function.apply("diego"));

        Function<String, String> functionTwo = String::toUpperCase;
        System.out.println(functionTwo.apply("diego"));

        BiFunction<String, String, String> functionThree = (a,b) -> a.toUpperCase() + b.toLowerCase();
        System.out.println(functionThree.apply("d","IEGO"));

        BiFunction<String, String, Integer> functionFour = String::compareTo;
        System.out.println(functionFour.apply("diego","diego"));


    }
}
