package Prep.Lesson4.HomeTask3;


import java.util.ArrayList;
import java.util.List;

public class HomeTask1 {
    public static void main(String args[]) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "Electronics", "A"));
        products.add(new Product("Smartphone", 800, "Electronics", "B"));
        products.add(new Product("Shirt", 50, "Clothing", "A"));
        products.add(new Product("Refrigerator", 1200, "Electronics", "A"));
        products.add(new Product("Jeans", 60, "Clothing", "B"));

        System.out.println(calculateTotalCost(products));

    }

    private static double calculateTotalCost(List<Product> products) {
        return products.stream().mapToDouble(Product::getPrice).sum();
    }
}
