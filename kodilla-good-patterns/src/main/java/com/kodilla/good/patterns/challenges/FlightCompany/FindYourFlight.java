package com.kodilla.good.patterns.challenges.FlightCompany;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FindYourFlight {


    // 1. Znalezienie wszystkich lotów z podanego miasta
    public static void findAllFlightsFromACityProvided(){

        AllFlights.getAllFlightsMap().entrySet().stream()
                .filter(flight -> Flight.getFromAirport().equals("Warsaw"))
                .forEach(System.out::println);
    }


    public static void findAllConnectionFromOneCityVer2() {
        AllFlights.getAllFlightsMap().entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(city -> Flight.getFromAirport().equals("Warsaw"))
                .forEach(System.out::println);

    }







   /* public static void findAllConnectionFromOneCityList() {
        AllFlights.getAllFlightsMap().stream().filter(c -> c.getFromAirport().equals("Warsaw"))
                .forEach(System.out::println);
    }


   public static void findAllConnectionFromOneCity(){

       AllFlights.getAllFlightsMap().entrySet().stream()
               .filter(flight -> Flight.getFromAirport().equals("Warsaw"))
               .forEach(System.out::println);
   }


*/
    /*
    public static void filterFlights(Map<Integer, String> allFlightsMap){
        Map<Integer, String> filteredFlightsMap =
                allFlightsMap.entrySet()
                        .stream()
                        .filter(s -> Flight.getFromAirport().equals("Warsaw"))
                        .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }




    public static void searchFlightsFrom(List<Flight> allFlightsMap, String fromAirport) {
        allFlightsMap.stream()
                .filter(flight -> flight.getFromAirport().equals(fromAirport))
                .forEach(System.out::println);
    }
*/

    // 2. Znalezienie wszystkich lotów do danego miasta
    public static void findAllFlightsToACityProvided(){

        AllFlights.getAllFlightsMap().entrySet().stream()
                .filter(flight -> Flight.getToAirport().equals("Szczecin"))
                .forEach(System.out::println);
    }


    // 3. Znalezienie lotów poprzez inne miasto np. lot z Gdańska przez Kraków do Wrocławia
    public static void findAllFlightByACityProvided(){

        AllFlights.getAllFlightsMap().entrySet().stream()
                .filter(flight -> Flight.getByAirport().equals("Warsaw"))
                .forEach(System.out::println);

    }
}
