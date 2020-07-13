package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.HashMap;
import java.util.Map;

public class AllFlights {

        public static Map<Integer, Flight> getAllFlightsMap() {
            Map<Integer, Flight> allFlightsMap = new HashMap<Integer, Flight>();
            allFlightsMap.put(0,new Flight("Gdansk","", "Warsaw"));
            allFlightsMap.put(1,new Flight("Gdansk","Warsaw", "Crakow"));
            allFlightsMap.put(2,new Flight("Gdansk", "","Wroclaw"));
            allFlightsMap.put(3,new Flight("Gdansk", "Warsaw","Rzeszow"));
            allFlightsMap.put(4,new Flight("Warsaw","", "Gdansk"));
            allFlightsMap.put(5,new Flight("Warsaw", "Gdansk","Szczecin"));
            allFlightsMap.put(6,new Flight("Warsaw", "","Poznan"));
            allFlightsMap.put(7,new Flight("Warsaw", "","Wroclaw"));
            allFlightsMap.put(8,new Flight("Warsaw", "","Crakow"));
            allFlightsMap.put(9,new Flight("Warsaw", "","Rzeszow"));
            allFlightsMap.put(10,new Flight("Crakow", "Warsaw","Gdansk"));
            allFlightsMap.put(11,new Flight("Crakow", "","Warsaw"));
            allFlightsMap.put(12,new Flight("Wroclaw","", "Warsaw"));
            allFlightsMap.put(13,new Flight("Wroclaw","Warsaw", "Gdansk"));
            allFlightsMap.put(14,new Flight("Rzeszow","", "Warsaw"));
            allFlightsMap.put(15,new Flight("Rzeszow","Warsaw", "Gdansk"));
            allFlightsMap.put(16,new Flight("Rzeszow","", "Szczecin"));
            allFlightsMap.put(17,new Flight("Poznan", "","Warsaw"));
            allFlightsMap.put(18,new Flight("Szczecin", "Gdansk","Warsaw"));
            allFlightsMap.put(19,new Flight("Szczecin","", "Rzeszow"));

            return allFlightsMap;
        }
}

