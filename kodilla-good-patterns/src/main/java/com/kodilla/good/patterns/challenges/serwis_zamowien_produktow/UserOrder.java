package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class UserOrder {

        private String firstName;
        private String lastName;

        public UserOrder (String firstName, String lastName) {
            this.firstName = firstName;
            this.lastName = lastName;
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }
}


