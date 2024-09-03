package Prep.Lesson4.HomeTask5;


import java.util.function.BiFunction;

public class ProductUtils {
    public static final BiFunction<String,Double,Product> createProduct=(name,price) -> new Product(name,price,"unknown","unknown");


}
