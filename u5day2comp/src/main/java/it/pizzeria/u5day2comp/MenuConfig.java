package it.pizzeria.u5day2comp;

import model.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class MenuConfig {

    @Bean
    public Topping cheese() {
        return new Topping("Cheese", 0.69, 92);
    }

    @Bean
    public Topping ham() {
        return new Topping("Ham", 0.99, 35);
    }

    @Bean
    public Topping pineapple() {
        return new Topping("Pineapple", 0.79, 24);
    }

    @Bean
    public Pizza margherita() {
        return new Pizza("Pizza Margherita", 4.99, 1104);
    }

    @Bean
    public Pizza hawaiian() {
        Pizza pizza = new Pizza("Hawaiian Pizza", 6.49, 1024);
        pizza.addTopping(ham());
        pizza.addTopping(pineapple());
        return pizza;
    }

    @Bean
    public Drink water() {
        return new Drink("Water (0.5L)", 1.29, 0);
    }

    @Bean
    public Drink lemonade() {
        return new Drink("Lemonade (0.33L)", 1.29, 128);
    }

    @Bean
    public Menu menu() {
        return new Menu(
                List.of(margherita(), hawaiian()),
                List.of(cheese(), ham(), pineapple()),
                List.of(water(), lemonade())
        );
    }
}
