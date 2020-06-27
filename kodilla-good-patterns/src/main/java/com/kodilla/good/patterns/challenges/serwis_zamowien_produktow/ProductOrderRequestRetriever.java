package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        UserOrder userOrder = new UserOrder ("John", "Wekl");
        LocalDateTime orderDate = LocalDateTime.of(2020, 6, 27, 16, 45);
        ProductOrder productOrder = new ProductOrder("Intel Core i7");


        System.out.println("User Order: " + UserOrder.getFirstName() + " " + UserOrder.getLastName());
        System.out.println("Product Order: " + productOrder);
        return new ProductOrderRequest(userOrder, productOrder, orderDate);
    }
}
