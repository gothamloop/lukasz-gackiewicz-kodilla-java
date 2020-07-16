package com.kodilla.good.patterns.challenges.FlightCompany;

public class Flight {


    private String fromAirport;
    private String toAirport;

    public Flight(String fromAirport, String toAirport) {
        this.fromAirport = fromAirport;
        this.toAirport = toAirport;
    }

    public String getFromAirport() {
        return fromAirport;
    }
    public String getToAirport() {
        return toAirport;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Flight flight = (Flight) o;

        if (!fromAirport.equals(flight.fromAirport)) return false;
        return toAirport.equals(flight.toAirport);
    }

    @Override
    public int hashCode() {
        int result = fromAirport.hashCode();
        result = 31 * result + toAirport.hashCode();
        return result;
    }


    @Override
    public String toString() {
        return "Flight{" +
                "fromAirport='" + fromAirport + '\'' +
                ", toAirport='" + toAirport + '\'' +
                '}';
    }



}
