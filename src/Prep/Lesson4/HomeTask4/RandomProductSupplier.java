package Prep.Lesson4.HomeTask4;

import java.util.Random;
import java.util.function.Supplier;

public class RandomProductSupplier {
    public static final Supplier<Product> randomProductSupplier = () -> {
        String[] names = {"Laptop", "Smartphone", "Refrigerator"};
        String[] categories = {"Electronics", "Appliances"};
        var random = new Random();
        String name = names[random.nextInt(names.length)];
        String category = categories[random.nextInt(categories.length)];
        double price = 500 + random.nextDouble() * 2500;
        String grade = "Standard";
        return new Product(name, price, category, grade);
    };
}