package java8.apistream;

import java8.models.User;

import java.util.stream.Stream;

class StreamDistinctUserExample {

    public static void main(String[] args) {

        var nameLength = Stream.of("Diego Rodriguez", "Alejandro Solano", "Ivan Rodriguez","Martha Aguilar","Ramon Morales","Diego Rodriguez")
                .distinct()
                .map(fullName -> new User(fullName.split(" ")[0], fullName.split(" ")[1]))
                .mapToInt(user -> user.toString().length())
                .peek(System.out::println);

        var statistics = nameLength.summaryStatistics();

        System.out.println("sum = " + statistics.getSum());
        System.out.println("max = " + statistics.getMax());


        
    }
}
