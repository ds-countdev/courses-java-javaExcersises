package system_class;

import java.io.IOException;

public class SOProgramExecuteExample {

    public static void main(String[] args) {

        var runTime = Runtime.getRuntime();
        Process process;

        try {
            var propertie = System.getProperty("os.name").toLowerCase();
            if (propertie.startsWith("windows")) process = runTime.exec("notepad");
            else if (propertie.startsWith("Mac")) process = runTime.exec("textedit");
            else if (propertie.contains("nux") || propertie.contains("nix"))
                process =runTime.exec("gedit");
            else process = runTime.exec("gedit");

            process.waitFor();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        System.out.println("application has been closed");
        System.exit(0);
        }
    }

