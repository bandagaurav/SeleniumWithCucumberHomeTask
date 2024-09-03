package Prep.Lesson1;

import java.util.ArrayList;
import java.util.List;

public class FlowerBase {
    enum Flower {
        ROSE(1), JASMINE(2), LILY(3);
        private final int price;

        Flower(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    static class Bouquet {
        private List<Flower> flowers;

        public Bouquet() {
            flowers = new ArrayList<>();
        }

        public void addFlower(Flower flower) {
            flowers.add(flower);
        }

        public int calculateCost() {
            int totalCost = 0;
            for (Flower flower : flowers) {
                totalCost += flower.getPrice();
            }
            return totalCost;
        }
    }

    public static void main(String[] args) {
        Bouquet bouquet = new Bouquet();
        bouquet.addFlower(Flower.ROSE);
        bouquet.addFlower(Flower.JASMINE);
        bouquet.addFlower(Flower.LILY);
        System.out.println("The cost of the bouquet is: $" + bouquet.calculateCost());
    }
}