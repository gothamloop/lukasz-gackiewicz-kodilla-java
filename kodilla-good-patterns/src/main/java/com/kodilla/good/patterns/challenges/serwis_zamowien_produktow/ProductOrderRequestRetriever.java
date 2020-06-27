package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        UserOrder userOrder = new UserOrder ("John", "Wekl");

        return new ProductOrderRequest(userOrder);
    }
}
