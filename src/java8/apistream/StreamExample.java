package java8.apistream;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {

        Stream<String> namesStream = Stream.of("Diego","Daniela", "Danna", "Diana");
        namesStream.forEach(System.out::println);

        namesStream = Arrays.stream(new String[]{"Diego","Alejandro", "Omar", "Miguel"});
        var countryNames = Stream.builder().add("France").add("Germany").add("England").add("Mexico");

        System.out.println("//////////////////hashSet");
        var setNames = new HashSet<String>(List.of("Diego","diego","Maria"));
        setNames.add("Romina");

        setNames.forEach(System.out::println);


    }

    public <T> String doSomething(T... objects){
        return null;
    }
}
