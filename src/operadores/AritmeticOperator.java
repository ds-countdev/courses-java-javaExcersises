package operadores;

import java.math.BigDecimal;

public class AritmeticOperator{
    public static void main(String[] args) {
        int i = 5, j=4, suma = i +j , rest = i-j;
        int mult = i*j, div = i/j;
        float divTwo = (float) i / (float) j;
        int newDiv = (int) divTwo;
        String esPar = "";
        double newE = new BigDecimal("1005.00").doubleValue();
        if(newE % 2 == 0)
             esPar ="es par";
        else esPar = "es impar";
        System.out.println(divTwo);
        System.out.println(esPar);


    }
}
