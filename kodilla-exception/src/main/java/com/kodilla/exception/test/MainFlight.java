package com.kodilla.exception.test;

import java.util.Scanner;

public class MainFlight {

    public static void main(String args[]) {

        InternationalFlight flightFinder = new InternationalFlight();

        try
        {
            InternationalFlight.findFlight(new Flight("WARSAW", "DUBLIN"));
        }
        catch (RouteNotFoundException e)
        {
            System.out.println("What happened - something wrong");
        }
        finally
        {
            System.out.println("Please check again");
        }

    }

}
