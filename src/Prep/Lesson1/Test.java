package Prep.Lesson1;

import java.util.ArrayList;

class PizzaBase {
    private String name;
    private double cost;

    public PizzaBase(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}

class Topping {
    private String name;
    private double cost;

    public Topping(String name, double cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }
}

class Pizza {
    private PizzaBase base;
    private ArrayList<Topping> toppings;

    @Override
    public String toString() {
        return "Pizza{" +
                "base=" + base +
                ", toppings=" + toppings +
                '}';
    }

    public Pizza(PizzaBase base) {
        this.base = base;
        this.toppings = new ArrayList<>();
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public double calculateCost() {
        double totalCost = base.getCost();
        for (Topping topping : toppings) {
            totalCost += topping.getCost();
        }
        return totalCost;
    }

}

public class Test {
    public static void main(String[] args) {
        PizzaBase standardBase = new PizzaBase("Standard", 5.0);
        PizzaBase softBase = new PizzaBase("Soft", 6.0);

        Topping tomato = new Topping("Tomato", 1.0);
        Topping corn = new Topping("Corn", 1.5);
        Topping mushrooms = new Topping("Mushrooms", 1.75);

        Pizza pizza = new Pizza(standardBase);
        pizza.addTopping(tomato);
        pizza.addTopping(corn);
        pizza.addTopping(mushrooms);

        System.out.println(pizza);
        System.out.println("Total cost: $" + pizza.calculateCost());
    }
}