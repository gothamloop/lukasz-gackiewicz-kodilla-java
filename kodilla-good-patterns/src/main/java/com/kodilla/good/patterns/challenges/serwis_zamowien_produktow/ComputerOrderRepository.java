package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;


public class ComputerOrderRepository implements ProductOrderRepository {

    @Override
    public boolean createProductOrder(UserOrder userOrder) {
        return false;
    }
}
