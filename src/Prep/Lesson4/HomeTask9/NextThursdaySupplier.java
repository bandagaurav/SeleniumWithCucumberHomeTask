package Prep.Lesson4.HomeTask9;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.util.function.Supplier;

public class NextThursdaySupplier {
    public static Supplier<LocalDate> nextThursday = () -> {
        LocalDate today = LocalDate.now();
        return today.with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
    };
}