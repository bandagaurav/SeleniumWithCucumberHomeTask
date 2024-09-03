package Prep.Lesson4.HomeTask6;

public class HomeTask6AllinOne {
    public static void main(String[] args) {
        // Check if a number is prime
        System.out.println("Is 29 prime? " + PrimeChecker.isPrime.test(29));

        // Print the square of a number
        SquarePrinter.printSquare.accept(10);

        // Get a random integer below 5000
        int randomInt = RandomIntSupplier.randomIntBelow5000.getAsInt();
        System.out.println("Random integer below 5000: " + randomInt);
    }
}