package com.kodilla.good.patterns.challenges.Food2Door;

public class UserOrder {
    private static String firstName;
    private static String lastName;

    public UserOrder (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() { return lastName;  }

}