package com.kodilla.exception.test;

import java.util.Scanner;

public class MainFlight {

    public static void main(String args[]) {

        Flight oneFlight = new Flight("WARSAW", "LODZ");
        Flight twoFlight = new Flight("WARSAW", "BERLIN");
        Flight threeFlight = new Flight("WARSAW", "DUBLIN");
        Flight fourFlight = new Flight("WARSAW", "LONDON");
        Flight fiveFlight = new Flight("LODZ", "WARSAW");

        InternationalFlight flightFinder = new InternationalFlight();

        try
        {
            InternationalFlight.findFlight(new Flight("WARSAW", "DUBLIN"));
        }
        catch (RouteNotFoundException e)
        {
            System.out.println("Something wrong with your flight");
        }
        finally
        {
            System.out.println("Please check again");
        }
    }
}
