package arrays;

import java.util.Arrays;

public class ArraysInverseExample {
    public static void main(String[] args) {

        String[] products = new String[7];
        var totalCount = products.length;

        products[0] = "Kingston Pen drive 6400";
        products[1] = "Samsumng Galaxy";
        products[2] = "Hard disk ssd samsumng extern";
        products[3] = "Asus Notebook";
        products[4] = "Macbook Air";
        products[5] = "Chromcast 4th generation";
        products[6] = "Bicycle oxford";

        Arrays.sort(products);

        System.out.println("Using for sentence");
        for (int i = 0; i < totalCount; i ++)
            System.out.println("product " + i + " is: ".concat(products[i]));

        System.out.println("using inverse for");
        for (int i = 0; i < totalCount; i ++)
            System.out.println("product " + ((totalCount-1)-i) + " is ".concat(products[(totalCount-1)-i]));

        System.out.println("using inverse for 2");
        for (int i = totalCount-1; i >= 0; i--)
            System.out.println("product " + i + " is ".concat(products[i]));
    }
}
