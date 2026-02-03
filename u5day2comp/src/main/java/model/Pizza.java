package model;

import java.util.ArrayList;
import java.util.List;

public class Pizza extends MenuItem {

    private final List<Topping> toppings = new ArrayList<>();

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}
