package poo_override.mx.diego;

class Calculator {

    int sum (int x, int y){return x + y;}

    float sum (float x, float y) {return x + y;}

    static double sum (double x, double y) {return x + y;}

    int sum (String x, String y) {

        int result;

        try {
            result = (int) Integer.parseInt(x) + Integer.parseInt(y);
        } catch (NumberFormatException exception){
            result = 0;
        }
        return result;
    }
}
