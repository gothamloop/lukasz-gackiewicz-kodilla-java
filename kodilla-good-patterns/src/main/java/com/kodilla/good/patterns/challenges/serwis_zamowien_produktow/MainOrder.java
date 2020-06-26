package com.kodilla.good.patterns.challenges.serwis_zamowien_produktow;

public class MainOrder {

    public static void main(String[] args) {

    RentRequestRetriever rentRequestRetriever = new RentRequestRetriever();
    RentRequest rentRequest = rentRequestRetriever.retrive();

    RentalProcessor rentalProcessor = new RentalProcessor(
            new MailService(), new CarRentalService(), new CarRentalRepository());
    rentalProcessor.process(user,rentFrom,rentTo);
   }
}
