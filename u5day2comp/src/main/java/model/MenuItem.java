package model;

public abstract class MenuItem {

    protected String name;
    protected double price;
    protected int calories;

    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }

    @Override
    public String toString() {
        return name + " | Calories: " + calories + " | Price: €" + price;
    }
}
