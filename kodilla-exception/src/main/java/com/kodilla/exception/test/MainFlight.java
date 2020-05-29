package com.kodilla.exception.test;

import java.util.Scanner;

public class MainFlight {

    public static void main(String args[]) {

        InternationalFlight flightFinder = new InternationalFlight();

        try
        {
            InternationalFlight.findFlight(new Flight("WARSAW", "LODZ"));
        }
        catch (RouteNotFoundException e)
        {
            System.out.println("What happened");
        }
        finally
        {
            System.out.println("Please check again");
        }

    }

}
