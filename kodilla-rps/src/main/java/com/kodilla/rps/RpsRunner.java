package com.kodilla.rps;

import java.util.Scanner;

public class RpsRunner {


    public static void main(String[] args) {

            boolean end = false;

                while (!end) {

                Scanner myObj = new Scanner(System.in);
                InfoForUsers.printInfo0();
                // String input
                String name = myObj.nextLine();
                InfoForUsers.printInfo00();
                // Numerical input
             //   int round = myObj.nextInt();
                    while (!myObj.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        myObj.nextLine();
                    }
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
                    while (!myObj2.hasNextInt()) {
                        System.out.println("Input is not a number.");
                        myObj2.nextLine();
                    }
                    int buttonUser = myObj2.nextInt();

                    InfoForUsers.printInfo2(buttonUser);

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

                    InfoForUsers.printInfoPoints(userResult, computerResult);
                    InfoForUsers.printInfoFinishGame();

                    Scanner scan = new Scanner(System.in);
                    String s = scan.nextLine();

                        if (s.equals("x")) {
                            break;
                        } else if (s.equals("n")) {
                            continue;
                        } else

                            System.out.println(s.toUpperCase() + " is not a valid character. Proram will be closed.");
                          break;

            }
        }
}
