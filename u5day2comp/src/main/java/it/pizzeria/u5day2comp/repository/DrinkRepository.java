package it.pizzeria.u5day2comp.repository;

import model.Drink;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DrinkRepository extends JpaRepository<Drink, Long> {

    // QUERY CUSTOM JPQL
    @Query("SELECT d FROM Drink d WHERE d.calories < :calories")
    List<Drink> findLowCalorieDrinks(int calories);
}
