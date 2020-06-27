package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        UserOrder userOrder = new UserOrder ("John", "Wekl");

        System.out.println("testing retrieve "+ userOrder);
        return new ProductOrderRequest(userOrder);

    }
}
