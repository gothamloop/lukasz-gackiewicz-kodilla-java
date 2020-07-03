package com.kodilla.good.patterns.challenges.Food2Door;

public class GlutenFreeShop implements ShopInterf {
    @Override
    public boolean process(UserOrder userOrder, ItemOrder itemOrder) {
        return false;
    }
}
