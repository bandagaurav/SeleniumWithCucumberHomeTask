package Prep.Lesson4.HomeTask8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HomeTask {

    public static void main(String args[]) {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Laptop", 1500, "Electronics", "A"));
        products.add(new Product("Smartphone", 800, "Electronics", "B"));
        products.add(new Product("Shirt", 50, "Clothing", "A"));
        products.add(new Product("Refrigerator", 1200, "Electronics", "A"));
        products.add(new Product("Jeans", 60, "Clothing", "B"));

List<Product> expensiveProducts=getProductsAbove1000(products);
System.out.println("Above 1000"+expensiveProducts);

        List<Product> electronicProducts=getElectronicsProducts(products);
        System.out.println("Electronics Products"+expensiveProducts);

        List<Product> expensiveProductswithUppercaseName=getExpensiveProductsUpperCase(products);
        System.out.println("Electronics Products Uppercase Name"+expensiveProductswithUppercaseName);
        long electronicsProductCount=getElectronicsProductsCount(products);
        System.out.println("Electronics Products Count"+electronicsProductCount);

    }

    private static long getElectronicsProductsCount(List<Product> products) {

        return products.stream().filter(product -> "Electronics".equalsIgnoreCase(product.getCategory())).count();
    }

    private static List<Product> getExpensiveProductsUpperCase(List<Product> products) {
        return products.stream().filter(product -> product.getPrice()>1000 && "Electronics".equalsIgnoreCase(product.getCategory())).peek(product -> product.setName(product.getName().toUpperCase())).collect(Collectors.toList());


    }

    private static List<Product> getElectronicsProducts(List<Product> products) {

        return products.stream().filter(product -> "Electronics".equalsIgnoreCase(product.getCategory())).collect(Collectors.toList());

    }

    private static List<Prep.Lesson4.HomeTask8.Product> getProductsAbove1000(List<Prep.Lesson4.HomeTask8.Product> products) {
   return products.stream().filter(product -> product.getPrice()>1000).collect(Collectors.toList());



    }


}
