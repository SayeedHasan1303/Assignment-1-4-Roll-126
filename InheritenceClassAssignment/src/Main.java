import java.time.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {
    private static String time;
    public static void main(String[] args) {
        System.out.print("Local Time: ");
        System.out.println(Clock.getTime());
        LocalDateTime timeObj = LocalDateTime.now();
        time = timeObj.toString();
        time = timeObj.toString();
        ZoneId California = ZoneId.of("America/Los_Angeles");
        ZonedDateTime CT = ZonedDateTime.of(timeObj,California);
        time = CT.toString();
        System.out.print("California Time: ");
        System.out.println(time.substring(11,16));
        System.out.print("New York Time: ");
        WorldClock.gethour(time.substring(0,5));



    }
}