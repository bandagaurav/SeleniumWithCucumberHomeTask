package Prep.Lesson4.HomeTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class HomeTask4 {
    public static void main(String args[]) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "Electronics", "A"));
        products.add(new Product("Smartphone", 800, "Electronics", "B"));
        products.add(new Product("Shirt", 50, "Clothing", "A"));
        products.add(new Product("Refrigerator", 1200, "Electronics", "A"));
        products.add(new Product("Jeans", 60, "Clothing", "B"));

        Predicate<Product> priceGreaterthan100orElectronics= product -> product.getPrice() > 100 || "Electronics".equals(product.getCategory());
        products.stream().filter(priceGreaterthan100orElectronics).forEach(System.out::println);

    }
    }
