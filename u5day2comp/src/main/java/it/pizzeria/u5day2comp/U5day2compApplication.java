package it.pizzeria.u5day2comp;
import model.*;
import repository.PizzaRepository;
import repository.DrinkRepository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class U5day2compApplication implements CommandLineRunner {

    private static final Logger log =
            LoggerFactory.getLogger(U5day2compApplication.class);

    private final ApplicationContext ctx;
    private final PizzaRepository pizzaRepository;
    private final DrinkRepository drinkRepository;

    @Value("${coperto.price}")
    private double costoCoperto;

    public U5day2compApplication(
            ApplicationContext ctx,
            PizzaRepository pizzaRepository,
            DrinkRepository drinkRepository
    ) {
        this.ctx = ctx;
        this.pizzaRepository = pizzaRepository;
        this.drinkRepository = drinkRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(U5day2compApplication.class, args);
    }

    @Override
    public void run(String... args) {

        // ===== STAMPA MENU =====
        Menu menu = ctx.getBean(Menu.class);
        menu.printMenu();

        // ===== CREAZIONE ORDINE =====
        Tavolo tavolo1 = new Tavolo(1, 4);
        Ordine ordine1 = new Ordine(1, tavolo1, 2, costoCoperto);

        ordine1.addItem(menu.getPizzas().get(0));
        ordine1.addItem(menu.getDrinks().get(0));

        log.info("\n" + ordine1);

        // ===== TEST QUERY REPOSITORY =====
        System.out.println("\n🍕 PIZZE CON PREZZO < 6€");
        pizzaRepository.findByPriceLessThan(6.0)
                .forEach(p -> System.out.println(p.getName()));

        System.out.println("\n🥤 DRINK CON CALORIE < 100");
        drinkRepository.findLowCalorieDrinks(100)
                .forEach(d -> System.out.println(d.getName()));
    }
}
