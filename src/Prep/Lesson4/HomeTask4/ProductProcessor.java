package Prep.Lesson4.HomeTask4;

import java.util.List;
import java.util.function.Consumer;

public class ProductProcessor {
    public static final Consumer<Product> updateGrade = product -> {
        if (product.price > 1000) {
            product.grade = "Premium";
        }
    };

    public static void processProducts(List<Product> products, Consumer<Product> consumer) {
        for (var product : products) {
            consumer.accept(product);
            System.out.println(product);
        }
    }
}