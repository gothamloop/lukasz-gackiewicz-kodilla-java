package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;

public class AllFlights {


    public static void getAllFlightsMap() {


        Flight flight1 = new Flight("Gdansk", "Warsaw");
        Flight flight2 = new Flight("Gdansk", "Cracow");
        Flight flight3 = new Flight("Gdansk", "Wroclaw");
        Flight flight4 = new Flight("Gdansk", "Rzeszow");
        Flight flight5 = new Flight("Warsaw", "Gdansk");
        Flight flight6 = new Flight("Warsaw", "Szczecin");

        // Creating a HashSet and filling it with objects
        HashSet<Flight> allFlightsSet = new HashSet<Flight>();
        allFlightsSet.add(flight1);
        allFlightsSet.add(flight2);
        allFlightsSet.add(flight3);
        allFlightsSet.add(flight4);
        allFlightsSet.add(flight5);
        allFlightsSet.add(flight6);

        // converting Set to Stream
       // Stream<Flight> stream = allFlightsSet.stream();

        // displaying elements of Stream using lambda expression
        //  stream.forEach(elem -> System.out.print(elem + " "));

   //     allFlightsSet.stream()
   //             .forEach(System.out::println);



        List<String> namesOfFlights = (List<String>) allFlightsSet.stream()
                .filter(flight -> flight.getToAirport().equals("Cracow"));
                //.forEach(System.out::println);
        System.out.println(namesOfFlights);




/*
        allFlightsSet.stream()
                .filter(flight -> flight.getFromAirport().equals("Warsaw"))
                .forEach(System.out::println);

        allFlightsSet.stream()
                .filter(flight -> flight.getToAirport().equals("Cracow"))
                .forEach(System.out::println);
*/





    }






    /*    public static Map<Integer, Flight> getAllFlightsMap() {
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




     */
}

