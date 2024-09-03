package Prep.Lesson4.HomeTask6;

import java.util.Random;
import java.util.function.IntSupplier;

public class RandomIntSupplier {
    public static IntSupplier randomIntBelow5000 = () -> {
        Random random = new Random();
        return random.nextInt(5000);
    };
}