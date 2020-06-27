package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class MainOrder {

    public static void main(String[] args) {

    ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
    ProductOrderRequest productOrderRequest = productOrderRequestRetriever.retrieve();

    ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
               new MailService(), new ComputerOrderService(), new ComputerOrderRepository());
        productOrderProcessor.process(productOrderRequest);
   }
}
