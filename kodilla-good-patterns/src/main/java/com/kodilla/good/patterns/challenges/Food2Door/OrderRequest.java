package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class OrderRequest {
    private UserOrder userOrder;
    private ItemOrder itemOrder;
    LocalDateTime orderTime;

    public OrderRequest(UserOrder userOrder, ItemOrder itemOrder, LocalDateTime orderTime) {
        this.userOrder = userOrder;
        this.itemOrder = itemOrder;
        this.orderTime = orderTime;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }

}
