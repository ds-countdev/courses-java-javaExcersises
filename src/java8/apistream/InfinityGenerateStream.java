package java8.apistream;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class InfinityGenerateStream {

    public static void main(String[] args) {

        var count = new AtomicInteger(0);

        Stream.generate(() -> {
            try {
                TimeUnit.SECONDS.sleep(2);
            }catch(Exception exception){
                exception.printStackTrace();
            }
            return count.incrementAndGet();
        }).limit(5).forEach(System.out::println);
    }
}
