package wrapper;

public class AutoboxingInteger {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        var sum = 0;
        for (int number : intArr)
            if ( number % 2 == 0) sum += number;
        System.out.println("sum = " + sum);
    }
}
