package math;

import java.util.Random;

public class MathRandomExample {

    public static void main(String[] args) {

        String[] colors = {"yellow", "red", "blue", "green", "pink"};

        var randomNum = (int) Math.floor((Math.random() * colors.length));
        System.out.println("color:" + colors[randomNum]);

        var randomClass = new Random().nextInt(colors.length);
        System.out.println("colors = " + colors[randomClass]);





    }
}
