package variables;

public class Primitives{
    public static void main(String[] args) {

        byte nByte = 127;
        System.out.println("numeroByte"+ nByte);
        System.out.println("tipo byte corresponde en byte a: "+ Byte.BYTES);
        System.out.println("tipo byte corresponde en bites a " + Byte.SIZE);
        System.out.println("valor maximo: " + Byte.MAX_VALUE);
        System.out.println("tipo byte corresponde en bites a " + Byte.MIN_VALUE);

        short nShort = 3000;
        System.out.println("numeroShort"+ nShort);
        System.out.println("tipo short corresponde en byte a: "+ Short.BYTES);
        System.out.println("tipo short corresponde en bites a " + Short.SIZE);
        System.out.println("valor maximo: " + Short.MAX_VALUE);
        System.out.println("tipo byte corresponde en bites a " + Short.MIN_VALUE);

        int nInt = 32768;
        System.out.println("numeroInt"+ nInt);
        System.out.println("tipo int corresponde en byte a: "+ Integer.BYTES);
        System.out.println("tipo short corresponde en bites a " + Integer.SIZE);
        System.out.println("valor maximo: " + Integer.MAX_VALUE);
        System.out.println("tipo byte corresponde en bites a " + Integer.MIN_VALUE);

        long nLong = 9223372036854775807L;
        System.out.println("numeroLong"+ nLong);
        System.out.println("tipo long corresponde en byte a:" + Long.BYTES);
        System.out.println("tipo long corresponde en bites a " + Long.SIZE);
        System.out.println("valor maximo: " + Long.MAX_VALUE);
        System.out.println("valor minimo" + Integer.MIN_VALUE);

        var nVar = 127;

        byte nOne = 23;
        byte nTwo = 30;
        int nthre = 100;

        int sum = nthre - nOne;

        System.out.println(sum);




    }
}
