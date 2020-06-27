package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ComputerOrderService implements ProductOrderService{

    @Override
    public boolean buy(UserOrder userOrder) {
        return false;
    }
}
