package system_class;

import java.util.Properties;

public class SystemPropertiesExample {

    public static void main(String[] args) {
        
        var userName = System.getProperty("user.name");
        System.out.println("userName = " + userName);

        var home = System.getProperty("user.home");
        System.out.println("workspace =" + home);

        var workspace = System.getProperty("user.dir");
        System.out.println("workspace = " + workspace);

        var java = System.getProperty("java.version");
        System.out.println("java = " + java);

        var lineSeparator = System.getProperty("line.separator");
        var lineSeparatorTwo = System.lineSeparator();
        System.out.println("lineSeparator + = " + lineSeparator + "Una linea nueva");
        System.out.println("lineSeparator + = " + lineSeparatorTwo + "Una linea nueva");

        Properties properties = System.getProperties();
        properties.list(System.out);

    }
}
