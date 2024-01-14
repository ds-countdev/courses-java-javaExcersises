package date;

import java.text.SimpleDateFormat;
import java.util.AbstractMap;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class JavaUtilCalendarExample {

    public static void main(String[] args) {

        var calendar = Calendar.getInstance();

        //calendar.set(2024, 0, 15, 20);
        calendar.set(Calendar.YEAR, 2024);
        calendar.set(Calendar.MONTH, Calendar.JANUARY);
        calendar.set(Calendar.DAY_OF_MONTH, 15);
        calendar.set(Calendar.HOUR_OF_DAY, 20);
        var date = calendar.getTime();
        System.out.println("date = " + date);

        var dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
        var dateWithFormat = dateFormat.format(date);
        System.out.println("dateWithFormat = " + dateWithFormat);
        
        
        var laDateTime = laDate(new Date(), "America/New_York");
        System.out.println("laDateTime = " + laDateTime);
    }

    public static String laDate(Date date,String timeZone){
    var dateFormat = new SimpleDateFormat("dd-MMMM-yyyy HH:mm:ss");
    dateFormat.setTimeZone(TimeZone.getTimeZone(timeZone));
    return dateFormat.format(date);

    }
}
