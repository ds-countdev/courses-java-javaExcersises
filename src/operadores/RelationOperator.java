package operadores;

public class RelationOperator {
    public static void main(String[] args) {
        int i = 3;
        byte j = 7;
        float k = 127e-7f;
        double l =  2.1413e3;
        boolean m = false;
        boolean b1 = i ==j;
        System.out.println(b1);
        boolean b2 = !b1;
        boolean b3 = b1 != b2;
        System.out.println(b3);
        boolean b4 = false;
        b4 = i >= j;
        b4 = i <= j;
        System.out.println(b4);
        


    }

}
