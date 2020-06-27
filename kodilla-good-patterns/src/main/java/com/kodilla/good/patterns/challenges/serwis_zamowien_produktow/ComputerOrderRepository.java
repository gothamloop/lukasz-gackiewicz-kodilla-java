package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

import java.time.LocalDateTime;

public class ComputerOrderRepository implements ProductOrderRepository {


    @Override
    public boolean createProductOrder(UserOrder userOrder, LocalDateTime from, LocalDateTime to) {
        return false;
    }
}
