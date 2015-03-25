import java.util.*;

/**
 * Created by drussell on 3/23/2015.
 */
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class DateCal {
    public static void main(String[] args) {

        DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        //get current date time with Date()
        Date date = new Date();
        System.out.println(dateFormat.format(date));

        //get current date time with Calendar()
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));

        //Set the calendar to target datetime
        Calendar calendar = new GregorianCalendar();
        calendar.set(Calendar.YEAR,2015);
        calendar.set(Calendar.MONTH,03);
        calendar.set(Calendar.DATE,23);

        Calendar now = Calendar.getInstance();
        now.set(Calendar.HOUR_OF_DAY, 12);
        now.set(Calendar.MINUTE, 30);
        Calendar givenDate = Calendar.getInstance();


        boolean isBefore = now.before(givenDate);
        System.out.println(isBefore);




    }

    }

