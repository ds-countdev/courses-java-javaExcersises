package wrapper;

public class BooleanWrapper {
    public static void main(String[] args) {

        Integer numOne = 1 , numTwo = 2;

        var booleanPrim = (numOne > numTwo);
        var booleanObject = (Boolean) booleanPrim;
        var boolenaObjectTwo = Boolean.valueOf(booleanPrim);
        var booleanObjectThree = false;

        System.out.println("booleanPrim = " + booleanPrim);
        System.out.println("booleanObject = " + booleanObject);
        System.out.println("boolenaObjectTwo = " + boolenaObjectTwo);
        System.out.println("booleanObjectThree = " + booleanObjectThree);

        System.out.println("comparing two boolean objects " + (booleanObject == boolenaObjectTwo));
        System.out.println("comparing two boolean objects " + (booleanObject.equals(boolenaObjectTwo)));
        System.out.println("comparing two boolean objects " + (boolenaObjectTwo == booleanObjectThree));
        System.out.println("comparing two boolean objects " + (booleanObject == booleanObjectThree));

        var booleanPrimTwo = (boolean) boolenaObjectTwo;
        System.out.println("booleanPrimTwo = " + booleanPrimTwo);


    }
}
