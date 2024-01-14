package date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class GetAge {

    public static void main(String[] args) throws ParseException {

        var scanner = new Scanner(System.in);
        System.out.println("insert birthday with the next format: dd/mm/yyyy" );
        var userBirthday = scanner.next();
        var dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        var dateUserBirthday = dateFormat.parse(userBirthday);
        var userAge = calculateAge(dateUserBirthday);
        System.out.println("userAge = " + userAge);

    }

    private static short calculateAge(Date dateUserBirthday){
        var calendar = Calendar.getInstance();
        calendar.setTime(dateUserBirthday);
        var userYear = (short) calendar.get(Calendar.YEAR);
        var userMonth = (short) calendar.get(Calendar.MONTH) + 1;
        var userDay = (short) calendar.get(Calendar.DAY_OF_MONTH);
        calendar.setTime(new Date());
        var age = (short) calendar.get(Calendar.YEAR) - userYear;
        var olderMonth = (userMonth >= calendar.get(Calendar.MONTH) + 1);
        var olderDay = (userDay >= calendar.get(Calendar.DAY_OF_MONTH));
        return (short) ((olderDay && olderMonth) ? age-1 : age);
    }
}
