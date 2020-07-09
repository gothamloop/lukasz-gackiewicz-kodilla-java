package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.social.share.TwitterPublisher;
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
            System.out.println("Steven is a " + stevenShouldBuy);
            String johnShouldBuy = john.sharePost();
            System.out.println("John is a " + johnShouldBuy);
            String kodillaShouldBuy = kodilla.sharePost();
            System.out.println("Kodilla is a " + kodillaShouldBuy);

            //Then
            Assert.assertEquals("Facebook Publisher", stevenShouldBuy);
            Assert.assertEquals("Snapchat Publisher", johnShouldBuy);
            Assert.assertEquals("Twitter Publisher", kodillaShouldBuy);
        }

        @Test
        public void testIndividualSharingStrategy() {
            //Given
            User steven = new Millenials("Steven Links");

            //When
            String stevenShouldBuy = steven.sharePost();
            System.out.println("Steven should: " + stevenShouldBuy);
            steven.setBuyingStrategy(new TwitterPublisher());
            stevenShouldBuy = steven.sharePost();
            System.out.println("Steven now should: " + stevenShouldBuy);

            //Then
            Assert.assertEquals("Twitter Publisher", stevenShouldBuy);
        }


    }
