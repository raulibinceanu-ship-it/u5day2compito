package model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Drink extends MenuItem {

    @Id
    @GeneratedValue
    private Long id;

    public Drink() {
        super();
    }

    public Drink(String name, double price, int calories) {
        super(name, price, calories);
    }
}
