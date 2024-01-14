import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        String hello = "Hello world!";
        System.out.println(hello.toUpperCase());

        int numero = 10;

        boolean valor = true;

        if(valor){
            numero = 5;
            System.out.println("numero"+ numero);
        }else{
            System.out.println("numero"+ numero);
        }

        var numero3 = 13;

        String nombre = "Diego".concat("Alejandro");

        if (numero3 > 10){
            nombre = "Alejandro";
        }
        System.out.println("nombre "+ nombre);

    }
}