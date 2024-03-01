package arrays;

import java.sql.SQLOutput;

public class ArraysForReusableBubbleOrdering {

    public static void sortBubble(Object[] arr){

        var TOTAL_COUNT = arr.length;
        var count = 0;

        for (int i =0;  i < TOTAL_COUNT - 1; i++){
            for (int j = 0; j < (TOTAL_COUNT - 1) - i; j++) {
                if ( ((Comparable) arr[j + 1]).compareTo( arr[j]) < 0){
                    var aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
                count ++;
            }
        }
        System.out.println("count :" + count);
    }

    public static void main(String[] args) {

        String[] products = {"Kingston Pen drive 6400","Samsung Galaxy", "Hard disk ssd Samsung extern",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle oxford"};

        sortBubble(products);

        for (String product : products)
            System.out.println("product : " + product);

        Integer[] numbers = {9, 30, 3, -2, 20, 4};

        sortBubble(numbers);

        for (int number : numbers)
            System.out.println("product : " + number);
    }
}
