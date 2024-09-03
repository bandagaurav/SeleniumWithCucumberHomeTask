package Prep.Lesson4.HomeTask4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.function.Consumer;

public class ProductPrinter {
    public static Consumer<Product> printProduct(String medium) {
        return product -> {
            if ("file".equals(medium)) {
                try (var writer = new BufferedWriter(new FileWriter("products.txt", true))) {
                    writer.write(product.toString());
                    writer.newLine();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } else {
                System.out.println(product);
            }
        };
    }
}