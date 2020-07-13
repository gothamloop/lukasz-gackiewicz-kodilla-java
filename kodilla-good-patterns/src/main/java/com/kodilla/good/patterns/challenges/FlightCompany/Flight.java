package com.kodilla.good.patterns.challenges.FlightCompany;

public class Flight {

      private static String fromAirport;
      private static String byAirport;
      private static String toAirport;

    public Flight(String fromAirport, String byAirport, String toAirport) {
        this.fromAirport = fromAirport;
        this.byAirport = byAirport;
        this.toAirport = toAirport;
    }

    public static String getFromAirport() {
        return fromAirport;
    }
    public static String getByAirport() { return byAirport; }
    public static String getToAirport() {
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


    @Override
    public String toString() {
        return "Flight{" +
                "fromAirport='" + fromAirport + '\'' +
                ", byAirport='" + byAirport + '\'' +
                ", toAirport='" + toAirport + '\'' +
                '}';
    }



}
