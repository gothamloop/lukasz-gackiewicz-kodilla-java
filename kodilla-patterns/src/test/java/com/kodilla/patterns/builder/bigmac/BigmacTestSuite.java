
package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {

        @Test
        public void testPizzaNew() {
            //Given
            Bigmac bigmac = new Bigmac.BigmacBuilder()
                    .ingredient("Onion")
                    .bun("Roll")
                    .burgers(1)
                    .sauce("Spicy")
                    .ingredient("Ham")
                    .ingredient("Mushrooms")
                    .build();
            System.out.println(bigmac);
            //When
            int howManyIngredients = bigmac.getIngredients().size();
            //Then
            Assert.assertEquals(3, howManyIngredients);
        }
    }


