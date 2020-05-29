package com.kodilla.exception.test;

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


    }
}
