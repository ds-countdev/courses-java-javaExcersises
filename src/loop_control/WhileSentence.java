package loop_control;

public class WhileSentence {
    public static void main(String[] args) {

        var i = 0;

        while(i < 5) {
            System.out.println("i = " + i);
            i++;
        }

        var flag = true;
        i = 0;

        do{
            if (i == 10) flag = false;
            System.out.println("i = " + i);
            i ++;
        }while (flag);

    }
}
