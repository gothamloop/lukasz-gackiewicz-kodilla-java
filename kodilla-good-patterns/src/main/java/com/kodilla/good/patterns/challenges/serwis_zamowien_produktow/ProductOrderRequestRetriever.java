package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequestRetriever {

    public RentRequest retrieve() {

        User user = new User ("John", "Wekl");

        LocalDateTime rentFrom = LocalDateTime.of(2017,8,1,12,0);
        LocalDateTime rentTo = LocalDateTime.of(2017,8,10,12,0);

        return new RentRequest(user,rentFrom,rentTo)
    }
}
