package java8.apistream;

import java.util.stream.Stream;

class FilterEmpty {

    public static void main(String[] args) {

        var count = Stream.of("Diego", "Alejandro", "Rodriguez","solano", "", "")
                .filter(String::isEmpty)
                .peek(System.out::println)
                .count();

        System.out.println("count = " + count);
        
    }
}
