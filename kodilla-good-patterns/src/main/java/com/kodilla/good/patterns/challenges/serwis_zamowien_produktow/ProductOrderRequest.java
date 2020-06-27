package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private static UserOrder userOrder;

    public ProductOrderRequest(final UserOrder userOrder){
        this.userOrder = userOrder;
    }

public static UserOrder getUserOrder() {return userOrder; }

}
