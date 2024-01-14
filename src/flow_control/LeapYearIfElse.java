package flow_control;

import java.util.Scanner;

public class LeapYearIfElse {
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int month = 0, days = 0, year = 2023;

        System.out.println("how many days have? : insert the number month");
        month = scanner.nextInt();


        if( month == 1 || month == 3 || month == 5 || month == 7 || month == 9 || month ==11)
            days = 31;
        else if (month == 4 || month == 6 || month == 8 || month == 10 || month == 12)
            days = 30;
        else if (month == 2)
            if(year % 400 ==0 || ( (year % 4 == 0) && !(year % 100 == 0)))
                days = 29;
            else days = 28;

        System.out.println("days number : ".concat(String.valueOf(days)));

    }
}
