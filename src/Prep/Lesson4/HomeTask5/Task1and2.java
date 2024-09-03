package Prep.Lesson4.HomeTask5;

import java.util.HashMap;
import java.util.Map;

public class Task1and2 {
    public static void main(String args[]) {

Product product1=ProductUtils.createProduct.apply("Galaxy",999.99);
        Product product2=ProductUtils.createProduct.apply("Iphone",9999.99);
        System.out.println("Product1"+product1);
        System.out.println("Product2"+product2);


        Map<Product,Integer> cart=new HashMap<>();
        cart.put(product1,2);
        cart.put(product2,1);
        double cartCost=ProductUtils1.calculateCartCost.apply(cart,null);
        System.out.println("Total Cart Cost"+cartCost);





    }




    }
