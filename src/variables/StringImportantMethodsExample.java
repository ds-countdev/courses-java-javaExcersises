package variables;

import javax.sound.midi.Soundbank;

public class StringImportantMethodsExample {

    public static void main(String[] args) {

        String name = "diego";
        System.out.println("length : ".concat(String.valueOf(name.length())));
        System.out.println("UpperCase : ".concat(name.toUpperCase()));
        System.out.println("LowerCase : ".concat(name.toLowerCase()));
        System.out.println("Equals : ".concat(String.valueOf(name.equals("Diego"))));
        System.out.println("EqualsIgnoreCase : ".concat(String.valueOf(name.equalsIgnoreCase("Diego"))));
        System.out.println("CompareTo : ".concat(String.valueOf(name.compareTo("Diego"))));
        System.out.println("CompareTo : ".concat(String.valueOf(name.compareTo("diego"))));
        System.out.println("CharAt(0) : ".concat(String.valueOf(name.charAt(0))));
        System.out.println("CharAt(lastOne) : ".concat(String.valueOf(name.charAt(name.length()-1))));
        System.out.println("Substring : ".concat(name.substring(1,3)));

        StringBuilder stringBuilder = new StringBuilder("trabalenguas");
        System.out.println("Replace : ".concat(stringBuilder.toString().replace('a','b')));
        System.out.println("IndexOf : ".concat(String.valueOf(stringBuilder.toString().indexOf('a'))));
        System.out.println("Contains : ".concat(String.valueOf(stringBuilder.toString().contains("tra"))));
        stringBuilder.append(" ");
        System.out.println(stringBuilder);
        System.out.println("Trim :".concat(stringBuilder.toString().trim()));



    }
}
