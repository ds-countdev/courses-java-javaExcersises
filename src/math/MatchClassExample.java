package math;

public class MatchClassExample {

    public static void main(String[] args) {

        var number = Math.abs(-23);
        System.out.println("number = " + number);

        var max = Math.max(2,3);
        System.out.println("max = " + max);

        var min = Math.min(1.2,3.5);
        System.out.println("min = " + min);

        var ceil = Math.ceil(3.5);
        System.out.println("ceil = " + ceil);

        var floor = Math.floor(3.5);
        System.out.println("floor = " + floor);

        var integer = Math.round(3.8);
        System.out.println("integer" + integer);

        var pi = Math.round(Math.PI);
        System.out.println("pi = " + pi);
        
        var exp = Math.exp(3);
        System.out.println("exp = " + exp);

        var log = Math.log(2);
        System.out.println("log = " + log);

        var pow = Math.pow(2,3);
        System.out.println("pow = " + pow);

        var sqrt = Math.sqrt(2);
        System.out.println("sqrt = " + sqrt);

        var degrees = Math.toDegrees(1.57);
        degrees = Math.round(degrees);
        System.out.println("degrees = " + degrees);

        var radians = Math.toRadians(90.00);
        System.out.println("radians = " + radians);


        System.out.println("cos(90) =" +  Math.cos(radians));
        System.out.println("sin(90) =" +  Math.sin(radians));


    }
  
    
}
