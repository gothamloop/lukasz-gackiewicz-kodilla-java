package com.kodilla.good.patterns.challenges.FlightCompany;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FindYourFlight {

    /*
    public static List<Flight> fromFlights(String flightFromACity) {
        return AllFlights.getAllFlightsMap()
                .stream()
                .filter(flight -> flight.getFromAirport().equals(flightFromACity))
                .collect(Collectors.toList());
    }

    public static List<Flight> toFlights(String flightToACity) {
        return AllFlights.getAllFlightsMap()
                .stream()
                .filter(flight -> flight.getToAirport().equals(flightToACity))
                .collect(Collectors.toList());
    }


    public static List<Flight> fromToByFlights(String flightFromACity,String flightToACity) {
        return AllFlights.getAllFlightsMap()
                .stream()
                .filter(flight -> flight.getFromAirport().equals(flightFromACity))
                .filter(flight -> flight.getToAirport().equals(flightToACity))
                .collect(Collectors.toList());
    }
*/

  public static List fromByToFlight (String from, String by, String to) {
      List<Flight> fromByToFlightList = AllFlights.getAllFlightsMap()
              .stream()
              .filter(flight -> flight.getFromAirport().equals(from))
              .filter(flight -> flight.getToAirport().equals(by))
              .collect(Collectors.toList());

      List<Flight> fromByToFlightList2 = AllFlights.getAllFlightsMap()
              .stream()
              .filter(flight -> flight.getFromAirport().equals(by))
              .filter(flight -> flight.getToAirport().equals(to))
              .collect(Collectors.toList());

      return fromByToFlightList;



  }
}
