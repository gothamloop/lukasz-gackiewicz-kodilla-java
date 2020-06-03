package com.kodilla.exception.test;

import java.util.Scanner;

public class MainFlight {

    public static void main(String args[]) {

        try
        {
            InternationalFlight.findFlight(new Flight("WARSAW", "LONDON"));
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
