package it.pizzeria.u5day2comp;

import model.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class U5day2compApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(U5day2compApplication.class);

    private final ApplicationContext ctx;

    @Value("${coperto.price}")
    private double costoCoperto;

    public U5day2compApplication(ApplicationContext ctx) {
        this.ctx = ctx;
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

        // aggiungo elementi al menu
        ordine1.addItem(menu.getPizzas().get(0)); // prima pizza
        ordine1.addItem(menu.getDrinks().get(0)); // primo drink

        // ===== STAMPA ORDINE CON LOGGER =====
        log.info("\n" + ordine1);
    }
}
