package arrays;

public class ArraysInverseExamplebubble {

    public static void sortBubble(Object[] arr){
        final var TOTAL_COUNT = arr.length;
        var count = 0;

        for (int i = 0; i < TOTAL_COUNT -1; i++) {
            for (int j = 0; j < (TOTAL_COUNT -1) -i; j++) {
                if ( ((Comparable) arr[j + 1]).compareTo(arr[j]) < 0){
                    var aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
                count ++;
            }
        }
        System.out.println("count = " + count);
    }

    public static void main(String[] args) {

        String[] products = {"Kingston Pen drive 6400","Samsung Galaxy", "Hard disk ssd Samsung extern",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle oxford"};

        //Arrays.sort(products);
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

        sortBubble(products);
        final var TOTAL_COUNT = products.length;
        for (int i = 0; i < TOTAL_COUNT; i ++)
            System.out.println("product " + i + " is: ".concat(products[i]));


        Integer[] numbers = {28,5,9,30,15,6};
        sortBubble(numbers);
        final var NUMBERS_SIZE = numbers.length;


        for (int i = 0; i < NUMBERS_SIZE; i ++)
            System.out.println("product " + i + " is: ".concat(String.valueOf(numbers[i])));

    }
}
