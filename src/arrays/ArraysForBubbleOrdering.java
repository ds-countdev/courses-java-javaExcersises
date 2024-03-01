package arrays;

public class ArraysForBubbleOrdering {

    public static void main(String[] args) {

        String[] products = {"Kingston Pen drive 6400","Samsung Galaxy", "Hard disk ssd Samsung extern",
                "Asus Notebook", "Macbook Air", "Chromecast 4th generation", "Bicycle oxford"};

        var TOTAL_COUNT = products.length;
        var count = 0;

        for (int i =0;  i < TOTAL_COUNT - 1; i++){
            for (int j = 0; j < (TOTAL_COUNT - 1) - i; j++) {
                if (products[j + 1].compareTo(products[j]) < 0){
                    var aux = products[j];
                    products[j] = products[j + 1];
                    products[j + 1] = aux;
                }
                count ++;
            }
        }
        System.out.println("count = " + count);

        for (String product : products)
            System.out.println("product : " + product);
    }
}
