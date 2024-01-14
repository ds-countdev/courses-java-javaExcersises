package wrapper;

public class TrhougthValue {
    public static void main(String[] args) {

        var i = (Integer) 10;
        System.out.println("initiating main method i= " + i);
        test(i);
        System.out.println("ending main method i = " + i);


    }

    public static void test(Integer i){
        System.out.println("Initiating method test i= " + i);
        i = 35;
        System.out.println("ending method test i = " + i);
    }
}
