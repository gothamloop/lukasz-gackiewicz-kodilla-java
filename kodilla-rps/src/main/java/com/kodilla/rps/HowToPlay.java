/*package com.kodilla.rps;

import java.util.Scanner;

import com.kodilla.rps.RpsRunner;


public class HowToPlay {

    public int UserComputer(int buttonUser,int ranComputer) {







       do {
                    Scanner myObj2 = new Scanner(System.in);
                    System.out.println("Choose a button '1','2' or '3'");
                    System.out.println("A button '1' - ROCK");
                    System.out.println("A button '2' - PAPER");
                    System.out.println("A button '3' - SCISSORS");

                    buttonUser = myObj2.nextInt();
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
                    ranComputer = (int) (Math.random() * (max - min + 1) + min);
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
*/