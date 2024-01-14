package operadores;

import java.util.Scanner;

public class TernarioOperationGreaterNum {
    public static void main(String[] args) {

        var max = 0;
        var scanner = new Scanner(System.in);

        System.out.println("enter a number");
        var numOne = (int) scanner.nextDouble();
        System.out.println("enter a second number");
        var numTwo = (int) scanner.nextDouble();
        System.out.println("enter a number");
        var numThree = (int) scanner.nextDouble();

        max = numOne > numTwo ? numOne : numTwo;
        max = max > numThree ? max : numThree;

        System.out.println("the greater number is: ".concat(String.valueOf(max)));
    }
}
