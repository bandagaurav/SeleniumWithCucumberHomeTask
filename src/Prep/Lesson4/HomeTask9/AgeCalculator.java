package Prep.Lesson4.HomeTask9;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

public class AgeCalculator {
    public static Function<LocalDate, Integer> calculateAge = birthDate -> Period.between(birthDate, LocalDate.now()).getYears();
}