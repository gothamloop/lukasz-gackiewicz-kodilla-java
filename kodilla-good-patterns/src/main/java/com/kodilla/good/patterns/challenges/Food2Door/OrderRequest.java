package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderRequest {
    private UserOrder userOrder;

    public OrderRequest(UserOrder userOrder) {
        this.userOrder = userOrder;
    }

    public UserOrder getUserOrder() {
        return userOrder;
    }

}
