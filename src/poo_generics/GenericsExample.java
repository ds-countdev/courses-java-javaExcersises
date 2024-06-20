package poo_generics;

import poo.Car;
import poo_interfaces.model.Client;
import poo_interfaces.model.PremiumClient;

import java.util.Arrays;
import java.util.List;

public class GenericsExample {

    public static void main(String[] args) {

        Client [] clientArray = { new Client("Diego", "Rodriguez"),
                new Client("Alejandro", "Solano")};

        Car [] carsArray = { new Car("Ferrari", "F44"),
                new Car("Lamborghini", "Aventador")};

        List<Client> clientsList = listToArray(clientArray);
        List<Car> carsList = listToArray(carsArray);

        clientsList.forEach(System.out::println);
        carsList.forEach(System.out::println);

        List<Client> clientArrayTwo = listToArray(
                new Client[] {
                        new Client("Elvira", "Hernandez"),
                        new Client("Elvira", "Perez")
                }, carsArray
        );

        var premiumClientList = listToArray(
                new PremiumClient[] {
                new PremiumClient("Diego", "Alejandro"),
                new PremiumClient("Alejandro", "Solano")
        });

        printClient(premiumClientList);

        clientArrayTwo.forEach(System.out::println);

        System.out.println("============================");

        System.out.println("Max of 1, 5, 9 is : " + max(1,5,9));
        System.out.println("Max of 1.2, 5.3, 9.9 is : " + max(1.2,5.3,9.9));
        System.out.println("Comparable of Diego, Alejandro, Elvira is : "
                + max("Diego","Elvira","Alejandro"));
    }

    static <T extends Car> List <T> listToArray(T[] array) {
        return Arrays.asList(array);
    }

    static <T extends Client> List <T> listToArray(T[] array) {
        return Arrays.asList(array);
    }

    static <T, G> List <T> listToArray(T[] array, G[] print) {
        for (G data : print) System.out.println(data);
        return Arrays.asList(array);
    }

    static void printClient(List<? extends Client> client){
        client.forEach(System.out::println);
    }

    public static <T extends Comparable<T>> T max (T a, T b, T c){
        var max = a;
        if ( b.compareTo(max) > 0 ) max = b;
        if ( c.compareTo(max) > 0 ) max = c;
        return max;
    }
}
