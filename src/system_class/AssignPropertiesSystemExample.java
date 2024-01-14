package system_class;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class AssignPropertiesSystemExample {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("src/system_class/config.properties2");

            Properties properties = new Properties(System.getProperties());
            properties.load(file);
            properties.setProperty("my.costume.property", "this is my save object");
            System.setProperties(properties);
            System.getProperties().list(System.out);

            Properties systemProperties = System.getProperties();
            System.out.println("systemProperties = " + systemProperties.getProperty("my.costume.property"));
            System.out.println(systemProperties.getProperty("config.port.server"));
            System.out.println(systemProperties.getProperty("config.author.name"));
            System.out.println(systemProperties.getProperty("config.author.email"));
        } catch (Exception e ) {
            System.err.println("not exist file := " + e);
            //System.exit(1);
            main(args);
        }
        System.out.println("hello");
    }
}
