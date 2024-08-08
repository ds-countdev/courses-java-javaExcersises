package java8.apistream;

import java8.models.User;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

public class ListToStreamExample {
    public static void main(String[] args) {

        var t1 = System.currentTimeMillis();
        var namesStream = List.of(
                new User("Alejandro", "Solano"),
                new User("Noemi","Flores"), new User("Norma","Garcia"),
                new User("Sol","Mejia"), new User("Roberto","Wilson"), new User("Diego","Rodriguez")
           ).stream()
                .parallel()
                .map(user -> user.toString())
                .flatMap(name -> {
                    try {
                        TimeUnit.SECONDS.sleep(1);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    if (name.contains("Diego")) return Stream.of(name);
                    return Stream.empty();
                }).findAny().orElse("it doesn't found");
        var t2 = System.currentTimeMillis();
        System.out.println("total time :" + (t2 - t1));
        System.out.println(namesStream);


    }
}
