package repository;

import it.pizzeria.u5day2comp.model.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ToppingRepository extends JpaRepository<Topping, Long> {

    // QUERY CUSTOM
    @Query("SELECT t FROM Topping t WHERE t.calories < :maxCalories")
    List<Topping> findLowCalories(int maxCalories);
}