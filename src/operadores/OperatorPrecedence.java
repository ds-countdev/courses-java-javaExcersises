package operadores;

public class OperatorPrecedence {

    public static void main(String[] args) {

        int i = 14, j = 7, k = 20;

        var average = (double) (i + j + k ) / 3;
        System.out.println(average);

        average = (double) (i + j + k) / 3 * 10;
        System.out.println(average);

        average = (double) --i + j++ + k / 3 * 10;
        System.out.println(average);



    }
}
