package Prep.Lesson4.HomeTask9;

import java.time.LocalDate;
import java.time.LocalTime;

public class HomeTask9Allinone {
    public static void main(String[] args) {
        // Check if a given date is yesterday
        System.out.println("Is the date yesterday? " + DateChecker.isYesterday.test(LocalDate.now().minusDays(1)));

        // Get the date for next Thursday
        LocalDate nextThursday = NextThursdaySupplier.nextThursday.get();
        System.out.println("Next Thursday is on: " + nextThursday);

        // Get current time in EST timezone
        LocalTime currentTimeEST = CurrentTimeEST.currentTimeEST.get();
        System.out.println("Current time in EST: " + currentTimeEST);

        // Calculate age given the date of birth
        LocalDate birthDate = LocalDate.of(1990, 1, 1);
        int age = AgeCalculator.calculateAge.apply(birthDate);
        System.out.println("Age for the person born on " + birthDate + " is: " + age);
    }
}