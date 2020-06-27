package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public ProductOrderRequest retrieve() {

        UserOrder userOrder = new UserOrder ("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2017,8,1,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2017,8,10,12,0);

        return new ProductOrderRequest(userOrder);
    }
}
