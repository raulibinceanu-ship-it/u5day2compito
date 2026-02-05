package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Topping extends MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    public Topping() {
        super();
    }

    public Topping(String name, double price, int calories) {
        super(name, price, calories);
    }
}
