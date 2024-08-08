package java8.apistream;

import java.util.stream.Stream;

class StreamDistinctExample {

    public static void main(String[] args) {

        Stream.of("Diego", "Alejandro", "Rodriguez","solano", "", "","Diego","diego","Diego")
                .distinct()
                .forEach(System.out::println);

        
    }
}
