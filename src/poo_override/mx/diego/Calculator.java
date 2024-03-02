package poo_override.mx.diego;

class Calculator {

    private Calculator(){};

    static int sum (int x, int y){return x + y;}

    static float sum (float x, float y) {return x + y;}

    static double sum (double x, double y) {return x + y;}

    static int sum (String x, String y) {
        int result;
        try {
            result = (int) Integer.parseInt(x) + Integer.parseInt(y);
        } catch (NumberFormatException exception){
            result = 0;
        }
        return result;
    }

    static int sum(int... intArguments) {
        var total = 0;
      numbers :  for (int number : intArguments) total += number;
      return total;
    }

    static double sum(float num, double... varargs){
        var total = 0;
        try {
            varargs : for (Object number : varargs) total += (double) number;
            total += num;
        } catch (NumberFormatException exception) {
            System.out.println("error to parse");
        }
        return total;
    }
}
