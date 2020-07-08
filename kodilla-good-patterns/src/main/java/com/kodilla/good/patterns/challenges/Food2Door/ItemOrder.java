package com.kodilla.good.patterns.challenges.Food2Door;

public class ItemOrder {
    private static String name;
    private static int quantity;
    private static String typeOfProduct;

    public ItemOrder(String name, int quantity, String typeOfProduct) {
        this.name = name;
        this.quantity = quantity;
        this.typeOfProduct = typeOfProduct;
    }

    public static String getName() {
        return name;
    }
    public static String getTypeOfProduct() { return typeOfProduct; }
    public static int getQuantity() {
        return quantity;
    }
}
