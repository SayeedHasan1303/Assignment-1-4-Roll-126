import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
public class Clock {
    private static String Time;
    public static String getTime(){
        gethour();
        getminutes();
        return Time.substring(0,5);
    }
    public static   String gethour(){
        LocalTime timeObj = LocalTime.now();
        Time = timeObj.toString();
        return Time.substring(0,2);
    }
    public static String getminutes(){
        return Time.substring(2,5);
    }

}

