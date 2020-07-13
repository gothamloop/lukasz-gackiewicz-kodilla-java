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

    public String getFromAirport() {
        return fromAirport;
    }
    public String getByAirport() { return byAirport; }
    public String getToAirport() {
        return toAirport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!fromAirport.equals(flight.fromAirport)) return false;
        if (!byAirport.equals(flight.byAirport)) return false;
        return toAirport.equals(flight.toAirport);
    }

    @Override
    public int hashCode() {
        int result = fromAirport.hashCode();
        result = 31 * result + byAirport.hashCode();
        result = 31 * result + toAirport.hashCode();
        return result;
    }

}
