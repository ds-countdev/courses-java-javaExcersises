package operadores;

public class InstanceOfOperatorGenericType {
    public static void main(String[] args) {

        var text = (Object) new StringBuilder("hello there");
        var num = (Number) 8;
        boolean isInstanceOf = false;

        isInstanceOf = text instanceof StringBuilder;
        System.out.println(isInstanceOf);

        isInstanceOf = text instanceof Object;
        System.out.println(isInstanceOf);

        isInstanceOf = num instanceof Long;
        System.out.println(isInstanceOf);

        isInstanceOf = num instanceof Double;
        System.out.println(isInstanceOf);

        isInstanceOf = text instanceof Integer;
        System.out.println(isInstanceOf);

        isInstanceOf = num instanceof Integer;
        System.out.println(isInstanceOf);

        isInstanceOf = num instanceof Number;
        System.out.println(isInstanceOf);


    }
}
