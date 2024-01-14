package variables;

import java.util.stream.IntStream;

public class StringTestPerformanceConcat {

    public static void main(String[] args) {

        String a = "a";
        String b = "b";
        String c = "c";

        StringBuilder stringBuilder = new StringBuilder(a);

        long init = System.currentTimeMillis();

        for(int i=0;i<50000;i++) {
           // c = c.concat(a).concat(b).concat("\n");
            // c+= a + b + "\n";
            stringBuilder.append(a).append(b).append("\n");
        }

        System.gc();
        long end = System.currentTimeMillis();
        System.out.println(end - init);


    }
}
