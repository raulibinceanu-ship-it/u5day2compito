
package model;

import java.util.List;

public class Menu {

    private List<Pizza> pizzas;
    private List<Topping> toppings;
    private List<Drink> drinks;

    public Menu(List<Pizza> pizzas, List<Topping> toppings, List<Drink> drinks) {
        this.pizzas = pizzas;
        this.toppings = toppings;
        this.drinks = drinks;
    }

    // ===== GETTER NECESSARI =====

    public List<Pizza> getPizzas() {
        return pizzas;
    }

    public List<Topping> getToppings() {
        return toppings;
    }

    public List<Drink> getDrinks() {
        return drinks;
    }

    // ===== STAMPA MENU =====

    public void printMenu() {
        System.out.println("=== PIZZAS ===");
        pizzas.forEach(System.out::println);

        System.out.println("\n=== TOPPINGS ===");
        toppings.forEach(System.out::println);

        System.out.println("\n=== DRINKS ===");
        drinks.forEach(System.out::println);
    }
}
