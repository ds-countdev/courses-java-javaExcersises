package operadores;

public class InstanceOfOperator {
    public static void main(String[] args) {

        var text = new StringBuilder("hello there");
        var num = (Integer) 8;
        boolean isInstanceOf = false;

        isInstanceOf = text instanceof StringBuilder;
        System.out.println(isInstanceOf);

        isInstanceOf = text instanceof Object;
        System.out.println(isInstanceOf);

        isInstanceOf = num instanceof Integer;
        System.out.println(isInstanceOf);

        isInstanceOf = num instanceof Number;
        System.out.println(isInstanceOf);


    }
}
