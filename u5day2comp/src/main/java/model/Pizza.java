package model;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Pizza extends MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToMany
    private List<Topping> toppings = new ArrayList<>();

    public Pizza() {
        super();
    }

    public Pizza(String name, double price, int calories) {
        super(name, price, calories);
    }

    public void addTopping(Topping topping) {
        toppings.add(topping);
    }
}
