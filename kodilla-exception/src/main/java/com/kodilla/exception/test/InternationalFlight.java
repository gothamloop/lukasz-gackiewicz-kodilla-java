package com.kodilla.exception.test;

import com.kodilla.exception.test.Flight;
import java.util.HashMap;
import java.util.Map;

public class InternationalFlight {

    public static void findFlight(Flight flight) throws RouteNotFoundException {

        Map<String, Boolean> airportList = new HashMap<String, Boolean>();
        airportList.put("WARSAW", true);
        airportList.put("LODZ", true);
        airportList.put("BERLIN", true);
        airportList.put("DUBLIN", false);
        airportList.put("LONDON", false);

        System.out.println("The set is: " + airportList.entrySet());

        Boolean isFlightArrival = airportList.get(flight.getArrivalAirport());
        if(isFlightArrival == null || !isFlightArrival) {
            throw new RouteNotFoundException();
        }

        Boolean isFlightDeparture = airportList.get(flight.getDepartureAirport());
        if(isFlightDeparture == null || !isFlightDeparture) {
            throw new RouteNotFoundException();
        }


    }
}
