package com.kodilla.rps;

import java.util.Random;
import java.util.Scanner;

public class RpsRunner {



    public static void main(String[] args) {


        boolean end = false;
        Scanner myObj = new Scanner(System.in);

        System.out.println("*** This is a game Rock, Paper, Scissors ***");
        System.out.println("Please enter your name:");
        // String input
        String name = myObj.nextLine();
        System.out.println("How many rounds do you wanna play?");
        // Numerical input
        int round = myObj.nextInt();


        // Output input by user
        System.out.println("Name: " + name);
        System.out.println("You play "  + round + " Round/s ");


        int userPoints=0;
        int computerPoints=0;
        int userResult=0;
        int computerResult=0;
        System.out.println("How to play?");
        do {


        System.out.println("Choose a button '1','2' or '3'");
        System.out.println("A button '1' - ROCK");
        System.out.println("A button '2' - PAPER");
        System.out.println("A button '3' - SCISSORS");


        int buttonUser = myObj.nextInt();
        if(buttonUser == 1){
            System.out.println("You chose ROCK");
        }
        if(buttonUser == 2){
            System.out.println("You chose PAPER");
        }
        if(buttonUser == 3){
            System.out.println("You chose SCISSORS");
        }

        int min = 1;
        int max = 3;
        int ranComputer = (int)(Math.random() * (max - min + 1) + min);
        if(ranComputer == 1) {
            System.out.println("Computer chose ROCK");
        }
        if(ranComputer == 2) {
            System.out.println("Computer chose PAPER");
        }
        if(ranComputer == 3) {
            System.out.println("Computer chose SCISSORS");
        }




        if(buttonUser == 1 && ranComputer == 1) {
            System.out.println("It is a draw");

           userResult += userPoints +1;
           computerResult += computerPoints +1;
        }
        if(buttonUser == 1 && ranComputer == 2) {
            System.out.println("Computer win");

            computerResult += computerPoints +1;
        }
        if(buttonUser == 1 && ranComputer == 3) {
            System.out.println("You win");

            userResult += userPoints +1;
        }

        if(buttonUser == 2 && ranComputer == 1) {
            System.out.println("You win");

            userResult += userPoints +1;
        }

        if(buttonUser == 2 && ranComputer == 2) {
            System.out.println("It is a draw");

            userResult += userPoints +1;
            computerResult += computerPoints +1;
        }

        if(buttonUser == 2 && ranComputer == 3) {
            System.out.println("You win");

            userResult += userPoints +1;
        }

        if(buttonUser == 3 && ranComputer == 1) {
            System.out.println("Computer win");

            computerResult += computerPoints +1;
        }

        if(buttonUser == 3 && ranComputer == 2) {
            System.out.println("You win");

            computerResult += computerPoints +1;
        }

        if(buttonUser == 3 && ranComputer == 3) {
            System.out.println("It is a draw");

            userResult += userPoints +1;
            computerResult += computerPoints +1;
        }
            System.out.println("\n");
        round--;

        } while (round>0);
        System.out.println("User points: " +userResult);
        System.out.println("Computer points: " +computerResult);



        if(userResult>computerResult){
            System.out.println("You win all game!");
        }
        if(userResult==computerResult){
            System.out.println("It is a draw!");
        }
        if(userResult<computerResult){
            System.out.println("Computer win all game :( ");
        }

        // System.out.println("A button 'x' - Finish the game, Do you wanna stop playing?");
        // System.out.println("A button 'n' - Start the new game, Do you wanna stop playing?");

     //   while(!end) {




    }
}
