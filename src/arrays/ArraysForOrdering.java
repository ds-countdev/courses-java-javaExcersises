package arrays;

import java.util.Arrays;

public class ArraysForOrdering {

    public static void main(String[] args) {

        String[] products = {"Kingston Pen drive 6400","Samsung Galaxy", "Hard disk ssd Samsung extern",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle oxford"};

        var TOTAL_COUNT = products.length;
        var count = 0;

        for (int i =0;  i < TOTAL_COUNT; i++){
            for (int j = 0; j < TOTAL_COUNT; j++) {
                if (products[i].compareTo(products[j]) < 0){
                    var aux = products[i];
                    products[i] = products[j];
                    products[j] = aux;
                }
                count ++;
            }
        }
        System.out.println("count = " + count);
    }
}
