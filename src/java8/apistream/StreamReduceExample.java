package java8.apistream;

import java.util.stream.Stream;

public class StreamReduceExample {

    public static void main(String[] args) {

        var value = Stream.of("Diego", "Alejandro", "Rodriguez","solano", "", "","Diego","diego","Diego")
                .reduce( (a,b) -> a + ":" + b);

        var valueInt = Stream.of("4","A","2","8","10")
                .map(number -> {
                    if (number.matches("[0-9]*"))
                        return Integer.parseInt(number);
                    return 0;
                })
                        .reduce(0, Integer::sum);



        System.out.println("value = " + value);
        System.out.println("valueInt = " + valueInt);
    }
}
