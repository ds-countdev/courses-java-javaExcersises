package flow_control;

import java.util.Scanner;

public class LeapYearSwtich {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int month = 0, days = 0, year = 2023;

        System.out.println("how many days have? : insert the number month");
        month = scanner.nextInt();

        switch (month){
            case 1 :
            case 3 :
            case 5 :
            case 7 :
            case 9 :
            case 11:
                days = 31;
                break;
            case 4 :
            case 6 :
            case 8 :
            case 10 :
            case 12 :
                days = 30;
                break;
            case 2 :
                if(year % 400 ==0 || ( (year % 4 == 0) && !(year % 100 == 0)))
                    days = 29;
                else days = 28;
                break;
            default : days = 0;

        }

        System.out.println("days number : ".concat(String.valueOf(days)));

    }
}
