package Prep.Lesson1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

abstract class Confectionery {
    private String name;
    private double weight;

    public Confectionery(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }
}

class Chocolate extends Confectionery implements Comparable<Chocolate> {
    private int cocoaContentPercentage;

    public Chocolate(String name, double weight, int cocoaContentPercentage) {
        super(name, weight);
        this.cocoaContentPercentage = cocoaContentPercentage;
    }

    @Override
    public int compareTo(Chocolate o) {
        return Integer.compare(this.cocoaContentPercentage, o.cocoaContentPercentage);
    }
}

class Sweet extends Confectionery {
    public Sweet(String name, double weight) {
        super(name, weight);
    }
}

class NewYearsGift {
    private List<Confectionery> confectioneries;

    public NewYearsGift() {
        confectioneries = new ArrayList<>();
    }

    public void addConfectionery(Confectionery confectionery) {
        confectioneries.add(confectionery);
    }

    public double calculateTotalWeight() {
        double totalWeight = 0.0;
        for (Confectionery confectionery : confectioneries) {
            totalWeight += confectionery.getWeight();
        }
        return totalWeight;
    }

    public void sortChocolatesByCocoaContent() {
        Collections.sort(confectioneries, (c1, c2) -> {
            if (c1 instanceof Chocolate && c2 instanceof Chocolate) {
                return ((Chocolate) c1).compareTo((Chocolate) c2);
            }
            return 0;
        });
    }

    public List<Confectionery> getConfectioneriesByWeightRange(double minWeight, double maxWeight) {
        return confectioneries.stream()
                .filter(c -> c.getWeight() >= minWeight && c.getWeight() <= maxWeight)
                .collect(Collectors.toList());
    }
}

public class Bakery {
    public static void main(String[] args) {
        NewYearsGift gift = new NewYearsGift();
        gift.addConfectionery(new Chocolate("Dark Chocolate", 150, 70));
        gift.addConfectionery(new Sweet("Caramel Sweet", 100));
        gift.addConfectionery(new Chocolate("Milk Chocolate", 120, 30));

        System.out.println("Total weight of the gift: " + gift.calculateTotalWeight() + " grams");

        gift.sortChocolatesByCocoaContent();
        System.out.println("Chocolates sorted by cocoa content.");

        List<Confectionery> filteredConfectioneries = gift.getConfectioneriesByWeightRange(100, 150);
        System.out.println("Confectioneries between 100g and 150g:");
        for (Confectionery confectionery : filteredConfectioneries) {
            System.out.println(confectionery.getName() + " - " + confectionery.getWeight() + " grams");
        }
    }
}