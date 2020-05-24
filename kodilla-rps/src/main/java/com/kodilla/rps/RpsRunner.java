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

        System.out.println("How to play?");
        System.out.println("A button '1' - ROCK");
        System.out.println("A button '2' - PAPER");
        System.out.println("A button '3' - SCISSORS");
        System.out.println("A button 'x' - Finish the game, Do you wanna stop playing?");
        System.out.println("A button 'n' - Start the new game, Do you wanna stop playing?");
        System.out.println("Choose a button '1','2' or '3'");
        int button = myObj.nextInt();
        if(button == 1){
            System.out.println("You chose ROCK");
        }
        if(button == 2){
            System.out.println("You chose PAPER");
        }
        if(button == 3){
            System.out.println("You chose SCISSORS");
        }


     //   while(!end) {}



    }
}
