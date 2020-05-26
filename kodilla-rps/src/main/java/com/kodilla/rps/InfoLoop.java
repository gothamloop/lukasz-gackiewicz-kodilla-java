package com.kodilla.rps;

import java.util.Scanner;

public class InfoLoop {


    static void printInfoLoop(){

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
        System.out.println("You play " + round + " Round/s ");



        int userPoints = 0;
        int computerPoints = 0;
        int userResult = 0;
        int computerResult = 0;
        System.out.println("How to play?");


        do {
            Scanner myObj2 = new Scanner(System.in);


            InfoForUsers.printInfo1();


            int buttonUser = myObj2.nextInt();
            if (buttonUser == 1) {
                System.out.println("You chose ROCK");
            }
            if (buttonUser == 2) {
                System.out.println("You chose PAPER");
            }
            if (buttonUser == 3) {
                System.out.println("You chose SCISSORS");
            }

            int min = 1;
            int max = 3;
            int ranComputer = (int) (Math.random() * (max - min + 1) + min);
            if (ranComputer == 1) {
                System.out.println("Computer chose ROCK");
            }
            if (ranComputer == 2) {
                System.out.println("Computer chose PAPER");
            }
            if (ranComputer == 3) {
                System.out.println("Computer chose SCISSORS");
            }



            if (buttonUser == 1 && ranComputer == 1) {
                System.out.println("It is a draw");

                userResult += userPoints + 1;
                computerResult += computerPoints + 1;
            }
            if (buttonUser == 1 && ranComputer == 2) {
                System.out.println("Paper beats Rock, Computer win");

                computerResult += computerPoints + 1;
            }
            if (buttonUser == 1 && ranComputer == 3) {
                System.out.println("Rock beats Scissors, You win");

                userResult += userPoints + 1;
            }

            if (buttonUser == 2 && ranComputer == 1) {
                System.out.println("Paper beats Rock, You win");

                userResult += userPoints + 1;
            }

            if (buttonUser == 2 && ranComputer == 2) {
                System.out.println("It is a draw");

                userResult += userPoints + 1;
                computerResult += computerPoints + 1;
            }

            if (buttonUser == 2 && ranComputer == 3) {
                System.out.println("Scissors beats Paper, Computer win");

                computerResult += computerPoints + 1;
            }

            if (buttonUser == 3 && ranComputer == 1) {
                System.out.println("Rock beats Scissors, Computer win");

                computerResult += computerPoints + 1;
            }

            if (buttonUser == 3 && ranComputer == 2) {
                System.out.println("Scissors beats Paper, You win");

                userResult += userPoints + 1;
            }

            if (buttonUser == 3 && ranComputer == 3) {
                System.out.println("It is a draw");

                userResult += userPoints + 1;
                computerResult += computerPoints + 1;
            }
            System.out.println("\n");
            round--;

        } while (round > 0);








    }













}
