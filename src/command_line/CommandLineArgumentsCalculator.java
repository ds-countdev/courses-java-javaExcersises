package command_line;
public class CommandLineArgumentsCalculator {
    public static void main(String[] args) {

        if (args.length != 3) {
            System.err.println("Insert an operation (sum , rest, multiply, div) and two numbers");
            System.exit(-1);
        }

        var operationType = (String) args[0];
        var result = 0.0;
        int numA = 0 , numB = 0;

        try {
            numA = Integer.parseInt(args[1]);
            numB = Integer.parseInt(args[2]);
        } catch (NumberFormatException exception) {
            System.err.println("u must insert a integer number");
        }

        switch (operationType) {

            case "sum" :
                result = numA + numB;
                break;
            case "rest" :
                result = numA - numB;
                break;
            case "multiply" :
                result = numA * numB;
            case "div" :
                if (numB == 0) {

                    System.err.println("does not divide into zero");
                    System.exit(-1);
                }

                result = (double) numA / numB;

        }
        System.out.println("result = " + result);
    }
}
