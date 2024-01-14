package system_class;

import java.util.Map;

public class EnvironmentVariablesExample {

    public static void main(String[] args) {

        Map<String, String> envVar = System.getenv();
        System.out.println("envVar =" + envVar);

        var username = System.getenv("USERNAME");
        System.out.println("username = "+ username);
        
        var javaHome = System.getenv("JAVA_HOME");
        System.out.println("javaHome = " + javaHome);

        var temDir = System.getenv("TEMP");
        System.out.println("temDir = " + temDir);
        
        var path = System.getenv("PATH");
        System.out.println("path = " + path);

        var pathTwo = envVar.get("PATH");
        System.out.println("pathTwo =" + pathTwo);

    }
}
