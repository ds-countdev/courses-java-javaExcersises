package java8.apistream;

import java.util.stream.IntStream;

public class StreamRangeExample {

    public static void main(String[] args) {

        var intStream = IntStream.range(1, 20);

        var statistics = intStream.summaryStatistics();

        System.out.println("max = " + statistics.getMax());
        System.out.println("min = " + statistics.getMin());
        System.out.println("sum = " + statistics.getSum());
        System.out.println("average = " + statistics.getAverage());
    }
}
