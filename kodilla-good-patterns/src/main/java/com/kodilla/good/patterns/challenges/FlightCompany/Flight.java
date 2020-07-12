package com.kodilla.good.patterns.challenges.FlightCompany;

public class Flight {

      private String depAirport;
      private String arrAirport;

    public Flight(String depAirport, String arrAirport) {
        this.depAirport = depAirport;
        this.arrAirport = arrAirport;
    }

    public String getDepAirport() {
        return depAirport;
    }

    public String getArrAirport() {
        return arrAirport;
    }
}
