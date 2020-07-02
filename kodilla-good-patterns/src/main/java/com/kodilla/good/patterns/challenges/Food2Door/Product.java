package com.kodilla.good.patterns.challenges.Food2Door;

public class Product {

    private String productName;
    private int quantity;
    private String typeOfProduct;

    public Product(String productName, int quantity, String typeOfProduct) {
        this.productName = productName;
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;
    }

    @Override
    public String toString() {
        return  productName;
    }

}
