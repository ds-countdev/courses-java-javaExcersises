package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class UtilDateParse {
    public static void main(String[] args){

        var scanner = new Scanner(System.in);
        System.out.println("Insert a date : dd-mm-yyyy");
        var userDate = scanner.next();
        var dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        try {
            var dateParse = dateFormat.parse(userDate);
            System.out.println("date = " + dateFormat.format(dateParse));
            var actualDate = new Date();

            if (dateParse.after(actualDate))
                System.out.println("this date is after to actual date");
            else if (dateParse.before(actualDate))
                System.out.println("this date is before to actual date");
            else System.out.println("have the same date");
        }catch(ParseException ex){
            System.err.println("date format invalid " + ex.getMessage());
            System.err.println("the format it most be dd-mm-yyyy");
        }
    }
}
