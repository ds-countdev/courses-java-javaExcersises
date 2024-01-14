package wrapper;

public class RelationWrapperOperators {

    public static void main(String[] args) {

        var numOne =   Integer.valueOf(1000);
        var numTwo = numOne;

        System.out.println("numOne = " + numOne);
        System.out.println("numTwo = " + numTwo);
        StringBuilder sameValue = new StringBuilder(String.valueOf(numTwo == numOne));
        System.out.println("sameValue = " + sameValue);

        numTwo = 1000;

        System.out.println("numOne = " + numOne);
        System.out.println("numTwo = " + numTwo);

        sameValue = new StringBuilder(String.valueOf(numTwo == numOne));
        System.out.println("sameValue = " + sameValue);
        System.out.println("are equals = " + numOne.equals(numTwo));

    }
}
