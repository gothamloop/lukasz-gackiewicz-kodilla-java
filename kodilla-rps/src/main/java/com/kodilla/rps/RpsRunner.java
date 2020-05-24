package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {

    public static void main(String[] args) {

        boolean end = false;
        Scanner myObj = new Scanner(System.in);

        System.out.println("This is a game Rock, Paper, Scissors");
        System.out.println("Enter your name, and how many rounds you wanna play:");

        // String input
        String name = myObj.nextLine();

        // Numerical input
        int round = myObj.nextInt();

        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("You wanna play "  + round + " Round/s ");





    }
}
