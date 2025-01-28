package extras2;
import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

class TimeZones {
    public static void displayTimeInZones() {
        ZonedDateTime gmtTime = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime istTime = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pstTime = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");

        System.out.println("Current time in GMT: " + gmtTime.format(formatter));
        System.out.println("Current time in IST: " + istTime.format(formatter));
        System.out.println("Current time in PST: " + pstTime.format(formatter));
    }

    public static void main(String[] args) {
        displayTimeInZones();
    }
}
