package date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {

    public static void main(String[] args) {

        var date = new Date();
        var dateFormat = new SimpleDateFormat("EEEE dd 'in' MMMM yyyy 'at' HH:mm:ss");
        var newDateFormat = dateFormat.format(date);
        System.out.println("newDateFormat = " + newDateFormat);

        var j = (long) 0;
        for (int i = 0 ; i < 10000000 ; i ++)
            j += i;

        System.out.println("j = " + j);

        var dateTwo = new Date();
        var finalTime = (long) (dateTwo.getTime() - date.getTime());
        System.out.println("finalTime = " + finalTime);

    }
}
