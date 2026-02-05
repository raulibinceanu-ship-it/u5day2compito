package model;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class MenuItem {

    protected String name;
    protected double price;
    protected int calories;


    public MenuItem() {
    }

    public MenuItem(String name, double price, int calories) {
        this.name = name;
        this.price = price;
        this.calories = calories;
    }
}
