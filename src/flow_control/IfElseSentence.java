package flow_control;

import java.util.Scanner;

public class IfElseSentence {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.println("Enter your average");
        var average = scanner.nextDouble();

        if(average == 10)  System.out.println("u rock");
        else if(average >= 9) System.out.println("Congratulations you're very good");
        else if(average >= 8) System.out.println("you're good");
        else if(average >= 7) System.out.println("Can u improve but it's fine");
        else if(average >= 6) System.out.println("Almost fail, u have to improve");
        else System.out.println("u socks");
    }
}
