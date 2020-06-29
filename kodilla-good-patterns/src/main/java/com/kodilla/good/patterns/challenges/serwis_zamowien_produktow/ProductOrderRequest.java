package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ProductOrderRequest {

    private UserOrder userOrder;
    private ProductOrder productOrder;
    private LocalDateTime orderDate;

    public ProductOrderRequest(UserOrder userOrder, ProductOrder productOrder, LocalDateTime orderDate){
        this.userOrder = userOrder;
        this.productOrder = productOrder;
        this.orderDate = orderDate;
    }

public UserOrder getUserOrder() { return userOrder; }
public ProductOrder getProductOrder() { return productOrder; }
public LocalDateTime getOrderDate() { return orderDate; }


}
