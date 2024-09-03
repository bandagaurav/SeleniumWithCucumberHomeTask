package Prep.Lesson4.HomeTask4;

import java.util.function.Consumer;

public class ProductNameUpdater {
    public static final Consumer<Product> updateName = product -> {
        if (product.price > 3000) {
            product.name += "*";
        }
    };
}