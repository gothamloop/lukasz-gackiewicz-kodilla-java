package com.kodilla.good.patterns.challenges.Food2Door;

public class MainService {

    public static void main(String[] args) {
            OrderRequestRetriver orderRequestRetriver = new OrderRequestRetriver();
            OrderRequest orderRequest = orderRequestRetriver.retrive();

            OrderProcess.process(new GlutenFreeShop(), orderRequestRetriver.retrive());

            System.out.println("User of Order: " + UserOrder.getFirstName() + " " + UserOrder.getLastName());
            System.out.println("Item of Order: " + ItemOrder.getName() + " " + ItemOrder.getQuantity() + " " + ItemOrder.getTypeOfProduct());
            System.out.println("Time of Order: " + orderRequest.orderTime);
    }
}
