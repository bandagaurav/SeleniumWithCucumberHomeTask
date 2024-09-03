package Prep.Lesson4.HomeTask6;

import java.util.function.IntPredicate;

public class PrimeChecker {
    public static IntPredicate isPrime = number -> {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    };
}