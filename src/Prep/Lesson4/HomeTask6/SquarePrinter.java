package Prep.Lesson4.HomeTask6;

import java.util.function.IntConsumer;

public class SquarePrinter {
    public static IntConsumer printSquare = number -> {
        int square = number * number;
        System.out.println("Square of " + number + " is " + square);
    };
}