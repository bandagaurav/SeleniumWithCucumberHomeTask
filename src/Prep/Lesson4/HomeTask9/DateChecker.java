package Prep.Lesson4.HomeTask9;

import java.time.LocalDate;
import java.util.function.Predicate;

public class DateChecker {
    public static Predicate<LocalDate> isYesterday = date -> date.equals(LocalDate.now().minusDays(1));
}