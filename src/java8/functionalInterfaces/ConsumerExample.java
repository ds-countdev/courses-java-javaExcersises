package java8.functionalInterfaces;

import java8.models.User;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class ConsumerExample {
    public static void main(String[] args) {

        Consumer<Date> consumer = date ->{
            SimpleDateFormat format = new SimpleDateFormat("dd - MM - yyyy");
            System.out.println(format.format(date));
        };

        consumer.accept(new Date());

        BiConsumer<String, Integer> biConsumer = (name, age) ->
                System.out.println(name + " is " + age + " years old!!");


        biConsumer.accept("diego", 30);

        Supplier<String> supplier = () -> "Hello World";
        System.out.println(supplier.get());

        Consumer<String> consumerTwo = System.out::println;
        var names = new String[]{"diego","Alejandro"};
        new HashSet<String>(
                List.of(new String[]{"diego","Alejandro"}))
                .forEach(consumerTwo);

        BiConsumer<User, String> consumerThree = User::setName;
        var user = new User("diego","alejandro");
        consumerThree.accept(user, "Diego");
        System.out.println("user name = " + user.getName());

    }
}
