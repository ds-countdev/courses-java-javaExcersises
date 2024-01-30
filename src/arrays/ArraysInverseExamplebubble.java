package arrays;

import java.util.Arrays;

public class ArraysInverseExamplebubble {

    public static void main(String[] args) {

        String[] products = {"Kingston Pen drive 6400","Samsung Galaxy", "Hard disk ssd Samsung extern",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle oxford"};

        final var TOTAL_COUNT = products.length;
        //Arrays.sort(products);
        var count = 0;
        //algorithm bubble
//        for (int i = 0; i < TOTAL_COUNT; i++) {
//            for (int j = 0; j < TOTAL_COUNT; j++) {
//                if (products[i].compareTo(products[j]) < 0){
//                    var aux = products[i];
//                    products[i] = products[j];
//                    products[j] = aux;
//                }
//                count ++;
//            }
//        }
        //algorithm bubble optimized

        for (int i = 0; i < TOTAL_COUNT -1; i++) {
             for (int j = 0; j < (TOTAL_COUNT -1) -i; j++) {
                 if (products[j + 1].compareTo(products[j]) < 0){
                    var aux = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = aux;
                 }
                count ++;
             }
        }
        System.out.println(count);

        for (int i = 0; i < TOTAL_COUNT; i ++)
            System.out.println("product " + i + " is: ".concat(products[i]));

    }
}
