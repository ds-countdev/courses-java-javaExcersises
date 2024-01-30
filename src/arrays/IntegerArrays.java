package arrays;

import java.util.Arrays;

public class IntegerArrays {
    public static void main(String[] args) {

        String[] products = new String[7];
        var totalCount = products.length;

        products[0] = "Kingston Pen drive 6400";
        products[1] = "Samsumng Galaxy";
        products[2] = "Hard disk ssd samsumng extern";
        products[3] = "Asus Notebook";
        products[4] = "Macbook Air";
        products[5] = "Chromcast 4th generation";
        products[6] = "bicycle oxford";

        Arrays.sort(products);

        System.out.println("Using for sentence");
        for (int i = 0; i < totalCount; i ++)
            System.out.println("product " + i + " is: ".concat(products[i]));

        System.out.println("Using for each sentence");
        for (String product : products)
            System.out.println("product is: ".concat(product));

        System.out.println("Using while sentence");
        int i =0;
        while(i < totalCount){
            System.out.println("product " + i + " is: ".concat(products[i]));
            i ++;
        }

        System.out.println("Using Do while sentence");
        int j = 0;
        do{
            System.out.println("product " + j + " is: ".concat(products[j]));
            j++;
        }while (j < totalCount);



    int[] intArr = {1,2,3,Integer.parseInt("2"),5};

    int a = intArr[0],
        b = intArr[1],
        c = intArr[2],
        d = intArr[3],
        e = intArr[4];

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
    }
}
