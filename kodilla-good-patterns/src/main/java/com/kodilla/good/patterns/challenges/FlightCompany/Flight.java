package com.kodilla.good.patterns.challenges.FlightCompany;

public class Flight {

      private String fromAirport;
      private String byAirport;
      private String toAirport;

    public Flight(String fromAirport, String byAirport, String toAirport) {
        this.fromAirport = fromAirport;
        this.byAirport = byAirport;
        this.toAirport = toAirport;
    }

    public String getDepAirport() {
        return fromAirport;
    }
    public String getToAirport() { return byAirport; }
    public String getArrAirport() {
        return toAirport;
    }

}
