package cocktailproject;

import java.util.Calendar;

public class DateTimeLogger {

    static private Calendar c = Calendar.getInstance();

    public static String historyLogger() {
        return c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH) + 1) + "/" + c.get(Calendar.YEAR) + "--" + c.get(Calendar.HOUR_OF_DAY) + ":" + c.get(Calendar.MINUTE) + ":" + c.get(Calendar.SECOND) + "\n";
    }

}
