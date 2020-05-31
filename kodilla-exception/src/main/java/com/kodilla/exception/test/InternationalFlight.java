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

        for (Map.Entry<String, Boolean> flights : airportList.entrySet()) {
          if(flights.getValue() == false){
              System.out.println(flights.getKey() + "/" + flights.getValue());
                System.out.println("You can't flight there");
               throw new RouteNotFoundException();
            }
        }
    }
}
