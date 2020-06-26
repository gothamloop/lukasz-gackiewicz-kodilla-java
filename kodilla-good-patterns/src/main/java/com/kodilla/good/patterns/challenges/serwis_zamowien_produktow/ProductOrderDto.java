package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class ProductOrderDto {
    public UserOrder userOrder;
    public boolean isRented;

    public ProductOrderDto(final UserOrder userOrder, final boolean isRented){
        this.userOrder = userOrder;
        this.isRented= isRented;
    }

    public UserOrder getUser() {return userOrder;}
    public boolean isRented() {return isRented; }

}
