package Prep.Lesson4.HomeTask4;

import java.util.List;

public class PremiumProductPrinter {
    public static void printPremiumStarProducts(List<Product> products) {
        products.stream()
                .filter(p -> "Premium".equals(p.grade) && p.name.endsWith("*"))
                .forEach(System.out::println);
    }
}