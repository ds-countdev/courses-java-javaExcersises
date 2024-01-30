package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ArraysInverseExampleMutable {
    private static void invertingArr(String[] arr){
        final var TOTAL_COUNT = arr.length;
        for (int i = 0; i < (TOTAL_COUNT/2); i ++){
            var actual = arr[i];
            var lastActual = arr[(TOTAL_COUNT-1)-i];
            arr[i] = lastActual;
            arr[(TOTAL_COUNT-1)-i] = actual;
        }
    }
    public static void main(String[] args) {

        String[] products = {"Kingston Pen drive 6400","Samsung Galaxy", "Hard disk ssd Samsung extern",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle oxford"};

        var TOTAL_COUNT = products.length;
        Arrays.sort(products);

        invertingArr(products);

        //Collections.reverse(Arrays.asList(products));
        for (int i = 0; i < TOTAL_COUNT; i ++)
            System.out.println("product " + i + " is: ".concat(products[i]));

    }
}
