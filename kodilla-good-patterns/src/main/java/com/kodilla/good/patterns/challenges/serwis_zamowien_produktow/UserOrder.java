package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class UserOrder {

     private static String firstName;
     private static String lastName;

        public UserOrder (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public static String getFirstName() {
            return firstName;
        }
        public static String getLastName() {
            return lastName;
        }
}


