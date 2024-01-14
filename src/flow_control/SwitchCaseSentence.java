package flow_control;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class SwitchCaseSentence {
    public static void main(String[] args) throws Exception {

        var scanner = new Scanner(System.in);
        System.out.println("enter a name");
        var inValue = scanner.next();

        switch (inValue) {
            case "diego":
                System.out.println("youre the best");
                break;
            case "jhon":
                System.out.println("you socks");
                break;
            case "zuly":
                System.out.println("i like u");
                break;
            default:
                throw new Exception("uu");
        }

        System.out.println("enter a number month");
        var monthInNumber = scanner.nextInt();

        switch(monthInNumber){
            case 1:
                System.out.println("january");
                break;
            case 2:
                System.out.println("february");
                break;
            case 3:
                System.out.println("march");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                System.out.println("june");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("september");
                break;
            case 10:
                System.out.println("october");
                break;
            case 11:
                System.out.println("november");
                break;
            case 12:
                System.out.println("december");
                break;
            default:
                System.out.println("undefined");
                break;
        }



        }
    }

