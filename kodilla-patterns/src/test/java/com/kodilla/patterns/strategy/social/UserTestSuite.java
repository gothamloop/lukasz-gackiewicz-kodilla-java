package com.kodilla.patterns.strategy.social;

import org.junit.Assert;
import org.junit.Test;


    public class UserTestSuite {
        @Test
        public void testDefaultSharingStrategies() {
            //Given
            User steven = new Millenials("Steven Links");
            User john = new YGeneration("John Hemerald");
            User kodilla = new ZGeneration("Kodilla");

            //When
            String stevenShouldBuy = steven.sharePost();
            System.out.println("Steven is: " + stevenShouldBuy);
            String johnShouldBuy = john.sharePost();
            System.out.println("John is: " + johnShouldBuy);
            String kodillaShouldBuy = kodilla.sharePost();
            System.out.println("Kodilla is: " + kodillaShouldBuy);

            //Then
            Assert.assertEquals("Facebook Publisher", stevenShouldBuy);
            Assert.assertEquals("Twitter Publisher", johnShouldBuy);
            Assert.assertEquals("Snapchat Publisher", kodillaShouldBuy);
        }
/*
        @Test
        public void testIndividualSharingStrategy() {
            //Given
            Customer steven = new IndividualCustomer("Steven Links");

            //When
            String stevenShouldBuy = steven.predict();
            System.out.println("Steven should: " + stevenShouldBuy);
            steven.setBuyingStrategy(new AggressivePredictor());
            stevenShouldBuy = steven.predict();
            System.out.println("Steven now should: " + stevenShouldBuy);

            //Then
            Assert.assertEquals("[Aggressive predictor] Buy stock of XYZ", stevenShouldBuy);
        }

 */
    }
