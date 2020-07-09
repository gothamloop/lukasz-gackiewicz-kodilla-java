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
            String stevenIsUser = steven.sharePost();
            System.out.println("Steven is a " + stevenIsUser);
            String johnIsUser = john.sharePost();
            System.out.println("John is a " + johnIsUser);
            String kodillaIsUser = kodilla.sharePost();
            System.out.println("Kodilla is a " + kodillaIsUser);

            //Then
            Assert.assertEquals("Facebook Publisher", stevenIsUser);
            Assert.assertEquals("Snapchat Publisher", johnIsUser);
            Assert.assertEquals("Twitter Publisher", kodillaIsUser);
        }

        @Test
        public void testIndividualSharingStrategy() {
            //Given
            User steven = new Millenials("Steven Links");

            //When
            String stevenIsUser = steven.sharePost();
            System.out.println("Steven is a " + stevenIsUser);
            steven.setPublisher(new TwitterPublisher());
            stevenIsUser = steven.sharePost();
            System.out.println("Steven should be a " + stevenIsUser);

            //Then
            Assert.assertEquals("Twitter Publisher", stevenIsUser);
        }


    }
