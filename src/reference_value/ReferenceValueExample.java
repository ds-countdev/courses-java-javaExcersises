package reference_value;

public class ReferenceValueExample {

    public static void main(String[] args) {

        System.out.println("initializing main method");
        int [] edad = { 23, 30, 50};

        System.out.println("before to call test method");
        for (int i = 0 ; i < edad.length ; i++)
            System.out.println(edad[i]);

        test(edad);
        System.out.println("after to call test method");
        for (int i = 0 ; i < edad.length ; i ++)
            System.out.println(edad [i]);

        System.out.println("finishing main method");
    }

    private static void test(int [] edadArr){
        System.out.println("initializing method test");
        for (int i = 0 ; i < edadArr.length ; i++ )
            edadArr[i] += 20;
        System.out.println("finishing test method");
    }
}
