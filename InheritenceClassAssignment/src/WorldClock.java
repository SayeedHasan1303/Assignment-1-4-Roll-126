import java.time.LocalTime;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.LocalDateTime;
public class WorldClock extends Clock{

    public static String gethour(String time){
        ZoneId Newyork = ZoneId.of("America/New_York");
        LocalDateTime Time = LocalDateTime.now();
        ZonedDateTime NWT = ZonedDateTime.of(Time,Newyork);
        String TTime = NWT.toString();
        System.out.println(TTime.substring(11,16));


           return TTime.substring(14,19);
    }
}
