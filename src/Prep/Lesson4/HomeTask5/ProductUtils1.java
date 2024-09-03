package Prep.Lesson4.HomeTask5;

import java.util.Map;
import java.util.function.BiFunction;

public class ProductUtils1 {


    public static final BiFunction<String,Double,Product> createProduct=(name, price) -> new Product(name,price,"unknown","unknown");
public static final BiFunction<Map<Product,Integer>,Void,Double> calculateCartCost=(cart,unused) -> cart.entrySet().stream().mapToDouble(entry->entry.getKey().getPrice() * entry.getValue()).sum();
}
