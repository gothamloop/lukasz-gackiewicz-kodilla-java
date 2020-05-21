package com.kodilla.exception.test;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ExceptionHandling {

    public static void main(String args[]) {

        SecondChallenge secondChallenge = new SecondChallenge();
        String score = "";
        try {
            score = secondChallenge.probablyIWillThrowException(5.1, 4.9);
        } catch (Exception e) {
            System.out.println("Java exception: " + e);

        } finally {
            System.out.println(score);
        }

    }

}
