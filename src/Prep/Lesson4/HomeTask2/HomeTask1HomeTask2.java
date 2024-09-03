package Prep.Lesson4.HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HomeTask1HomeTask2 {
    public static void main(String args[]) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "Electronics", "A"));
        products.add(new Product("Smartphone", 800, "Electronics", "B"));
        products.add(new Product("Shirt", 50, "Clothing", "A"));
        products.add(new Product("Refrigerator", 1200, "Electronics", "A"));
        products.add(new Product("Jeans", 60, "Clothing", "B"));

        Predicate<Product> isPriceGreaterThan1000 = product -> product.price > 1000;
        Predicate<Product> isElectronicsCategory = product -> "Electronics".equals(product.category);

        System.out.println("Products with price greater than 1000/-:");
        filterAndPrintProducts(products, isPriceGreaterThan1000);

        System.out.println("\nProducts in Electronics category:");
        filterAndPrintProducts(products, isElectronicsCategory);
    }

    private static void filterAndPrintProducts(List<Product> products, Predicate<Product> predicate) {
        for (Product product : products) {
            if (predicate.test(product)) {
                System.out.println(product);
            }
        }
    }
}