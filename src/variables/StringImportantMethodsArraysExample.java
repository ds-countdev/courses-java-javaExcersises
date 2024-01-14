package variables;

public class StringImportantMethodsArraysExample {

    public static void main(String[] args) {

        String name = "diego:23 Am ";
        String trabalenguas = "trabalenguas";

        char[] array = trabalenguas.toCharArray();
        for(char letter: array)
            System.out.print(letter);

        String r = name.split(":[0-9]+.[A-Za-z]{2}")[0];
        System.out.println("\n".concat(r));





    }
}
