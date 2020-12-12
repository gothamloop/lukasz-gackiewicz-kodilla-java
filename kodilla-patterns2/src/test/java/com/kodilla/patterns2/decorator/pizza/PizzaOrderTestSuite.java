package com.kodilla.patterns2.decorator.pizza;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.math.BigDecimal;

public class PizzaOrderTestSuite {

    private PizzaOrder theOrder = new BasicPizzaOrder();

    @Test
    public void testPizzaOrderIngredientsGetCost() {

        //Given
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new SouceDecorator(theOrder);

        //When
        BigDecimal theCost = theOrder.getCost();

        //Then
        assertEquals(theCost, new BigDecimal(41));
    }


    @Test
    public void testPizzaOrderGetDescription() {

        //Given
        theOrder = new ExtraCheeseDecorator(theOrder);
        theOrder = new SouceDecorator(theOrder);

        //When
        String theDescription = theOrder.getIngredients();

        //Then
        assertEquals(theDescription, "Ingredients: cheese, salami, extra Cheese, garlic");
    }
}