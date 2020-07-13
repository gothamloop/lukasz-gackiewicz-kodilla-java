package com.kodilla.good.patterns.challenges.FlightCompany;

public class FindYourFlight {



    // 1. Znalezienie wszystkich lotów z podanego miasta
    public static void findAllFlightsFromACityProvided(){

        AllFlights.getAllFlightsMap().entrySet().stream()
                .filter(flight -> Flight.getFromAirport().equals("Warsaw"))
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

    }
}
