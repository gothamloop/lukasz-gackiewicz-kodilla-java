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

        //  System.out.println("Initial Mappings are: " + airportList);
        //  System.out.println("The Value is: " + airportList.get("WARSAW"));
        System.out.println("The set is: " + airportList.entrySet());
        //  System.out.println("The set is: " + airportList.keySet());
/*
        for (Map.Entry<String, Boolean> flights : airportList.entrySet()) {
            if(flights.getKey() != flight.getArrivalAirport()) {
                System.out.println("You can't flight there");
                System.out.println(flight.getArrivalAirport());
                throw new RouteNotFoundException();
            }}
            */

/*
        for (Map.Entry<String, Boolean> flights : airportList.entrySet()) {
            if(flights.getKey() == flight.getArrivalAirport()){
                System.out.println(flights.getKey() + "/" + flights.getValue());

                System.out.println("You can't flight there");
                throw new RouteNotFoundException();
                //  }
            }

       if (airportList.get("DUBLIN") == false) {
           System.out.println(airportList.get("CHICAGO"));
           System.out.println(airportList.get("DUBLIN"));
                 System.out.println("This flight is not possible");
                throw new RouteNotFoundException();
            }
    */



            if (flight.getArrivalAirport() =="DUBLIN") {
                System.out.println("You can't flight from this airport.");
                throw new RouteNotFoundException();
            }
        }




       /* for (Map.Entry<String, Boolean> flights : airportList.entrySet()) {
          if(flights.getValue() == false){
              System.out.println(flights.getKey() + "/" + flights.getValue());

                System.out.println("You can't flight there");
               throw new RouteNotFoundException();
          //  }
            }
*/


        }

