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










/*

    public static void findAllFlightsFromACityProvided1() {
        //   AllFlights.getAllFlightsMap();

    }



    public static void findAllFlightsToACityProvided() {
        AllFlights.getAllFlightsMap();

    }










    // 1. Znalezienie wszystkich lotów z podanego miasta
    public static void findAllFlightsFromACityProvided(){

        //   AllFlights.getAllFlightsMap().entrySet().stream()
        //          .filter(flight -> Flight.getFromAirport().equals("Warsaw"))
        //         .forEach(System.out::println);
    }





//  Znalezienie wszystkich lotów wszystkich miast - cała mapa
    public static void findAllFlights(){

     //   AllFlights.getAllFlightsMap().entrySet().stream()
      //          .forEach(System.out::println);
}


  /*  public static void findAllFlightsOnlyOneCity() {


        AllFlights.getAllFlightsMap().forEach((k, v) -> {
               System.out.println("Key : " + k + " Value : " + v);

              if ("1".equals(k)) {
                  System.out.println("Hello E");
               }
              if ("Warsaw".equals(v)) {
                  System.out.println("Hello Warsaw");}

              if ("Warsaw".equals(AllFlights.getAllFlightsMap())) {
                  System.out.println("Hello Warsaw");
              }


            });

    }



    public static void findAllConnectionFromOneCityList3() {
        AllFlights.getAllFlightsMap().values().stream()
                .filter(city -> city.getFromAirport().equals("Warsaw"))
                .forEach(System.out::println);

    }

    public static void findAllConnectionFromOneCityList4() {
        AllFlights.getAllFlightsMap().entrySet().stream()
                .map(entry -> entry.getValue())
                .filter(Flight -> Flight.getFromAirport().equals("Warsaw"))
                .forEach(System.out::println);

    }
    public static void findAllConnectionFromOneCityList5() {

        AllFlights.getAllFlightsMap().entrySet()
                .stream()
                .filter(e -> Flight.getFromAirport().equals("Szczecin"))
                .forEach(e -> System.out.println(e.getKey() + " = " + e.getValue()));
    }

    public static void findAllConnectionFromOneCityList6() {

        AllFlights.getAllFlightsMap().entrySet().stream()
                .filter(x -> Flight.getFromAirport().startsWith("Szczecin"))
                //.sorted()
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

    }*/
}
