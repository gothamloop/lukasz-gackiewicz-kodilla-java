package com.kodilla.good.patterns.challenges.Food2Door;

public class OrderProcess {

    public static void process(ShopInterf shopInterf, OrderRequest orderRequest) {
        boolean isProcessed = shopInterf.process(orderRequest.getUserOrder(), orderRequest.getItemOrder());
        if (isProcessed) {
            System.out.println("Done");
        } else {
            System.out.println("Problem");
        }
    }
}
