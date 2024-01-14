package operadores;

import java.util.Scanner;

public class TernarioOperation {
    public static void main(String[] args) {

        var scanner =  new Scanner(System.in);

        var variable = 7 == 7 ? "is true" : "is false";
        System.out.println(variable);

        final var scoreMin = 7.0;

        System.out.println("mathematics score:");
        var mathematics = (long) scanner.nextDouble();

        System.out.println("science score:");
        var science = (long) scanner.nextDouble();

        System.out.println("history score");
        var history = (long) scanner.nextDouble();

        var average = (double) (mathematics + science + history) / 3;

        System.out.println("Average score :".concat(String.valueOf(average)));

        var status = average >= average ? new StringBuilder("approve congratulations") : new StringBuilder("rejected");
        System.out.println(status.toString());


    }
}
