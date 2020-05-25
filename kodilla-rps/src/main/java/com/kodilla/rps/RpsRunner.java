package com.kodilla.rps;

import java.util.Random;
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
   //     int round = myObj.nextInt();


        // Output input by user
        System.out.println("Name: " + name);
    //    System.out.println("You wanna play "  + round + " Round/s ");

        System.out.println("How to play?");
        System.out.println("A button '1' - ROCK");
        System.out.println("A button '2' - PAPER");
        System.out.println("A button '3' - SCISSORS");
     //   System.out.println("A button 'x' - Finish the game, Do you wanna stop playing?");
     //   System.out.println("A button 'n' - Start the new game, Do you wanna stop playing?");
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

        int min = 1;
        int max = 3;
        int ran = (int)(Math.random() * (max - min + 1) + min);
        if(ran == 1) {
            System.out.println("Computer chose ROCK");
        }
        if(ran == 2) {
            System.out.println("Computer chose PAPER");
        }
        if(ran == 3) {
            System.out.println("Computer chose SCISSORS");
        }

        System.out.println("Who is better?");
        if(button == 1 && ran == 1) {
            System.out.println("It is a draw");
        }
        if(button == 1 && ran == 2) {
            System.out.println("Computer won");
        }
        if(button == 1 && ran == 3) {
            System.out.println("You won");
        }
        if(button == 2 && ran == 1) {
            System.out.println("You won");
        }
        if(button == 3 && ran == 1) {
            System.out.println("Computer won");
        }
        if(button == 3 && ran == 2) {
            System.out.println("You won");
        }
        if(button == 2 && ran == 2) {
            System.out.println("It is a draw");
        }
        if(button == 3 && ran == 3) {
            System.out.println("It is a draw");
        }
        if(button == 2 && ran == 3) {
            System.out.println("Computer won");
        }




     //   while(!end) {}



    }
}
