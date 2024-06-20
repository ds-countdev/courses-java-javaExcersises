package poo_exceptions;

public class Calculator {
    double divide (int num1, int num2) throws DivideByCeroException {
        if (num2 == 0) throw new DivideByCeroException("It doesn't divide by zero");
        return num1 / (double) num2;
    }

    double divide (String num1 , String num2) throws DivideByCeroException, FormatExchangeException {
       if (!num1.matches("^\\d+$") || !num2.matches("^\\d+$")) throw new FormatExchangeException("u must insert a number format");
       return divide(Integer.parseInt(num1), Integer.parseInt(num2));
    }
}
