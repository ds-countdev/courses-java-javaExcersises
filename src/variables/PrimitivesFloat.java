package variables;

import java.sql.SQLOutput;

public class PrimitivesFloat {
    public static void main(String[] args) {

        float realFloat = 2.12e3f; //2120f;
        Float profFloat = 2.12e3f;
        boolean f = profFloat.equals(realFloat);
        System.out.println(f);
        System.out.println("-------------");

        System.out.println("realFloat: "+ realFloat);
        System.out.println("realFloat en bytes: "+ Float.BYTES);
        System.out.println("realFloat en bites:" + Float.SIZE);
        System.out.println("realFloat maximo valor:"+ Float.MAX_VALUE);
        System.out.println("realFloat valor minimo:"+ Float.MIN_VALUE);


        double realDouble = 1.7976931348623157E308;
        System.out.println("realDouble: "+ realFloat);
        System.out.println("realDouble en bytes: "+ Double.BYTES);
        System.out.println("realDouble en bites:" + Double.SIZE);
        System.out.println("realDouble maximo valor:"+ Double.MAX_VALUE);
        System.out.println("realDouble valor minimo:"+ Float.MIN_VALUE);

        var varFlotante = 3.3;

    }
}
