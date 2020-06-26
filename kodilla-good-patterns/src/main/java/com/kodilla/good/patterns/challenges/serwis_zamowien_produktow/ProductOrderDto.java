package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class ProductOrderDto {
    public User user;
    public boolean isRented;

    public ProductOrderDto(final User user, final boolean isRented){
        this.user = user;
        this.isRented= isRented;
    }

    public User getUser() {return user;}
    public boolean isRented() {return isRented; }

}
