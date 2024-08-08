package java8.localdate;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.time.Year;

public class LocalDateExample {

    public static void main(String[] args) {

        var currentDate = LocalDate.now();
        System.out.println("currentDate = " + currentDate);

        currentDate = LocalDate.of(2024, 11, 2);
        System.out.println("currentDate = " + currentDate);

        currentDate= LocalDate.of(2024, Month.NOVEMBER, 3);
        System.out.println("currentDate = " + currentDate);

        currentDate = LocalDate.parse("2023-12-02");
        System.out.println("currentDate = " + currentDate);

        currentDate = LocalDate.now().plusYears(1);
        System.out.println("currentDate = " + currentDate);
        
        currentDate = LocalDate.now().minusWeeks(1);
        System.out.println("currentDate = " + currentDate);

        var dayOfWeek = LocalDate.parse("2024-11-23").getDayOfWeek();
        System.out.println("dayOfWeek = " + dayOfWeek);
        
    }
}
