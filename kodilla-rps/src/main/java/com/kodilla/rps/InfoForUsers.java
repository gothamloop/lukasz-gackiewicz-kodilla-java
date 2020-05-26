package com.kodilla.rps;

public class InfoForUsers {

    static void printInfo1() {
        System.out.println("Choose a button '1','2' or '3'");
        System.out.println("A button '1' - ROCK");
        System.out.println("A button '2' - PAPER");
        System.out.println("A button '3' - SCISSORS");
    }


     static int printInfoPoints(int userResult, int computerResult) {
        System.out.println("User points: " + userResult);
        System.out.println("Computer points: " + computerResult);

        if (userResult > computerResult) {
            System.out.println("You win all game!");
        }
        if (userResult == computerResult) {
            System.out.println("It is a draw!");
        }
        if (userResult < computerResult) {
            System.out.println("Computer win all game :( ");
        }

      return userResult;
    }

    static void printInfoFinishGame() {
        System.out.println("Would you like to continue?");
        System.out.println("A button 'n' - Start the new game, Do you wanna stop playing?");
        System.out.println("A button 'x' - Finish the game, Do you wanna stop playing?");
    }


}
