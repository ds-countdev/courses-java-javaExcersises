package wrapper;

public class WrapperInteger {

    public static void main(String[] args) {

        var intPrimitive = (int) 32798;
        var intobject = Integer.valueOf((int) 23323423532.34);
        var intObjectTwo = intobject;

        System.out.println("intObjectTwo = " + intObjectTwo);

        var num = intobject;
        var numPrimitive = (int) num;
        System.out.println("numPrimitive = " + numPrimitive);

        var shortObject = (short) 230;
        System.out.println("shortObject = " + shortObject);

        var byteShort = intobject.byteValue();
        System.out.println("byteShort = " + byteShort);



    }
}
