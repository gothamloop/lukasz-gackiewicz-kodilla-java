package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private static UserOrder userOrder;
    private ProductOrder productOrder;
    private LocalDateTime orderDate;

    public ProductOrderRequest(final UserOrder userOrder, final LocalDateTime orderDate){
        this.userOrder = userOrder;
        this.productOrder = productOrder;
        this.orderDate = orderDate;
    }

public static UserOrder getUserOrder() { return userOrder; }
public ProductOrder getProductOrder() { return productOrder; }
public LocalDateTime getOrderDate() { return orderDate; }


}
