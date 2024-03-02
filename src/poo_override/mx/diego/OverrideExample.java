package poo_override.mx.diego;

import static poo_override.mx.diego.Calculator.sum;

public class OverrideExample {
    public static void main(String[] args) {

        System.out.println(sum(5.5,5.5));
        System.out.println(sum(5,5));
        System.out.println(sum(5.4f,34.6f));
        System.out.println(sum("5","4"));
        System.out.println(sum(2,3,4,5,6,7,7,8));
        System.out.println(sum(34.00f,2.89,4,23.5));
    }
}
