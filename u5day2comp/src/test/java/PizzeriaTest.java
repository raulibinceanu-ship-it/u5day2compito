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
    assertNotNull(pizza);
    assertTrue(pizza.toString().contains("Margherita"));
}

//TEST 2
@Test
void testAggiuntaToppingAllaPizza() {
    Pizza pizza = new Pizza("Margherita", 4.99, 1104);
    Topping cheese = new Topping("Cheese", 0.69, 92);

    pizza.addTopping(cheese);
    assertTrue(pizza.toString().contains("Margherita"));
}
// TEST 3
@Test
void testTotaleOrdineConCoperti() {
    Tavolo tavolo = new Tavolo(1, 4);
    Ordine ordine = new Ordine(1, tavolo, 2, 2.50);

    Pizza pizza = new Pizza("Margherita", 4.99, 1104);
    Drink acqua = new Drink("Water", 1.29, 0);

    ordine.addItem(pizza);
    ordine.addItem(acqua);

    double totaleAtteso = 4.99 + 1.29 + (2 * 2.50);

    assertEquals(totaleAtteso, ordine.getTotale(), 0.01);
}

// TEST 4
@ParameterizedTest
@CsvSource({
        "1, 2.50, 2.50",
        "2, 2.50, 5.00",
        "4, 2.50, 10.00"
})
void testCostoCopertoParametrico(int coperti, double costoCoperto, double totaleAtteso) {
    Tavolo tavolo = new Tavolo(1, 4);
    Ordine ordine = new Ordine(1, tavolo, coperti, costoCoperto);

    assertEquals(totaleAtteso, ordine.getTotale(), 0.01);
}


}
