package Prep.Lesson4.HomeTask4;

import java.util.Random;
import java.util.function.Supplier;

public class OtpSupplier {
    public static final Supplier<String> otpSupplier = () -> {
        var random = new Random();
        int num = 100000 + random.nextInt(900000);
        return String.valueOf(num);
    };
}