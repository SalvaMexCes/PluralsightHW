package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class PizzaTest {

    @Test
    public void equalsCheckPizzaPrice(){
        Pizza p = new Pizza();
        p.calculatePizzaPrice("small");
        assertEquals(5, p.calculatePizzaPrice("small"));
    }

    @Test
    public void trueCheckPizzaPrice() {
        Pizza pizza = new Pizza();
        double largePrice = pizza.calculatePizzaPrice("large");
        assertTrue(largePrice == 15.0);
    }

    @Test
    public void falseCheckPizzaPrice() {
        Pizza pie = new Pizza();
        double mediumPrice = pie.calculatePizzaPrice("medium");
        assertFalse(mediumPrice != 10.0);
    }



}//Class
