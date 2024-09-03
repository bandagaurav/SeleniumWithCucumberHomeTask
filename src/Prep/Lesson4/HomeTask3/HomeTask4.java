package Prep.Lesson4.HomeTask3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeTask4 {
    public static void main(String args[]) {

            List<Product> products = new ArrayList<>();
            products.add(new Product("Laptop", 1500, "Electronics", "A"));
            products.add(new Product("Smartphone", 800, "Electronics", "B"));
            products.add(new Product("Shirt", 50, "Clothing", "A"));
            products.add(new Product("Refrigerator", 1200, "Electronics", "A"));
            products.add(new Product("Jeans", 60, "Clothing", "B"));

            System.out.println(calculateCostOfAllElectronics(products));

        }




    private static List<Product> calculateCostOfAllElectronics(List<Product> products) {
        return products.stream().filter(product -> product.getPrice()>1000).filter(product -> "Electronics".equalsIgnoreCase(product.getCategory())).collect(Collectors.toList());
    }

}
