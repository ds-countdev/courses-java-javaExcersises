package operadores;

public class IncrementDecrementOperator {

    public static void main(String[] args) {
        int j= 1;
        int a= ++j;
        System.out.println("j :".concat(String.valueOf(j).concat(" a :".concat(String.valueOf(a)))));
        a = j++;
        System.out.println("j :".concat(String.valueOf(j).concat(" a :".concat(String.valueOf(a)))));
        a = j--;
        System.out.println("j :".concat(String.valueOf(j).concat(" a :".concat(String.valueOf(a)))));
    }
}
