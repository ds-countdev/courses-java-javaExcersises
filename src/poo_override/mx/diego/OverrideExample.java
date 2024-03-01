package poo_override.mx.diego;

import static poo_override.mx.diego.Calculator.sum;

public class OverrideExample {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println(sum(5.5,5.5));
        System.out.println(calculator.sum(5,5));
        System.out.println(calculator.sum(5.4f,34.6f));
        System.out.println(calculator.sum("5","4"));

    }
}
