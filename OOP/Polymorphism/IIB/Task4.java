// 4. Time Zone Converter: Design a class for converting times between different time zones. Utilize an instance initializer block to set default time zone offsets.
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

class TimeZoneConverter {
    private ZoneId defaultZoneId;

    // Instance initializer block to set the default time zone offset
    {
        defaultZoneId = ZoneId.of("UTC");
    }

    // Constructor
    public TimeZoneConverter() {
        // Default constructor
    }

    // Method to convert time from one time zone to another
    public ZonedDateTime convertTime(LocalDateTime dateTime, String fromZone, String toZone) {
        ZoneId fromZoneId = ZoneId.of(fromZone);
        ZoneId toZoneId = ZoneId.of(toZone);
        ZonedDateTime fromZonedDateTime = dateTime.atZone(fromZoneId);
        return fromZonedDateTime.withZoneSameInstant(toZoneId);
    }

    // Method to get the default time zone
    public ZoneId getDefaultZoneId() {
        return defaultZoneId;
    }

    // Method to set a new default time zone
    public void setDefaultZoneId(String newZoneId) {
        this.defaultZoneId = ZoneId.of(newZoneId);
    }
}

public class Task4 {
    public static void main(String[] args) {
        TimeZoneConverter converter = new TimeZoneConverter();

        // Example usage
        LocalDateTime dateTime = LocalDateTime.now();
        String fromZone = "America/New_York";
        String toZone = "Asia/Tokyo";

        ZonedDateTime convertedTime = converter.convertTime(dateTime, fromZone, toZone);
        System.out.println("Original Time: " + dateTime);
        System.out.println("Converted Time: " + convertedTime);

        // Get and set default time zone
        System.out.println("Default Time Zone: " + converter.getDefaultZoneId());
        converter.setDefaultZoneId("America/Los_Angeles");
        System.out.println("Updated Default Time Zone: " + converter.getDefaultZoneId());
    }
}
