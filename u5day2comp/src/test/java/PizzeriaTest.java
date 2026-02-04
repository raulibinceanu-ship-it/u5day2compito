import model.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


public class PizzeriaTest {
// TEST 1
@Test
void testCreazionePizza() {
    Pizza pizza = new Pizza("Margherita", 4.99, 1104);

    assertEquals("Margherita", pizza.name);
    assertEquals(4.99, pizza.price);
    assertEquals(1104, pizza.calories);
}

//TEST 2
@Test
void testAggiuntaToppingAllaPizza() {
    Pizza pizza = new Pizza("Margherita", 4.99, 1104);
    Topping cheese = new Topping("Cheese", 0.69, 92);

    pizza.addTopping(cheese);
    assertEquals(1, pizza.getToppings().size());
}
// TEST 3
    

}
