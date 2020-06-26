package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class MainOrder {

    public static void main(String[] args) {

    ProductOrderRequestRetriever productOrderRequestRetriever = new ProductOrderRequestRetriever();
    ProductOrderRequest productOrderRequest = productOrderRequest.retrive();

    ProductOrderProcessor productOrderProcessor = new ProductOrderProcessor(
               new MailService(), new CarRentalService(), new CarRentalRepository());
        productOrderProcessor.process(userOrder,rentFrom,rentTo);
   }
}
