package com.kodilla.good.patterns.challenges.Food2Door;

import java.time.LocalDateTime;

public class OrderRequestRetriver {

    public OrderRequest retrive() {

        UserOrder userOrder = new UserOrder("Jan", "Kowalski");
        ItemOrder itemOrder = new ItemOrder("Cars", 10, "Toys");
        LocalDateTime orderTime = LocalDateTime.of(2020, 1, 5, 14, 30);

        return new OrderRequest(userOrder,itemOrder,orderTime);

    }
}