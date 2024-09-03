package Prep.Lesson4.HomeTask9;

import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Supplier;

public class CurrentTimeEST {
    public static Supplier<LocalTime> currentTimeEST = () -> {
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneId.of("America/New_York"));
        return zonedDateTime.toLocalTime();
    };
}