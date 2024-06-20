package poo_exceptions;

import javax.swing.*;
import java.math.BigDecimal;
import java.util.Arrays;



public class ExampleExceptions {

    public static void main(String[] args) {

        var calculator = new Calculator();
        var num1 = JOptionPane.showInputDialog("Insert a numeric value");
        var num2 = JOptionPane.showInputDialog("Insert an other numeric value");

        try {

            var resultDivide = calculator.divide(num1, num2);
            System.out.println(resultDivide);

        } catch (DivideByCeroException | FormatExchangeException exception) {
            System.out.println("Error");
            System.out.println(exception.getMessage());
            System.out.println(Arrays.toString(exception.getStackTrace()));
        } finally {
            System.out.println("is optional but happens if fail or not fail");
        }
        System.out.println("continue app");
        
    }
}
