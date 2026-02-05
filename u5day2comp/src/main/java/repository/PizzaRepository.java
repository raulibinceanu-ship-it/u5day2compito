package repository;

import it.pizzeria.u5day2comp.model.Pizza;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PizzaRepository extends JpaRepository<Pizza, Long> {

    // QUERY DERIVED
    List<Pizza> findByPriceGreaterThan(double price);
}
