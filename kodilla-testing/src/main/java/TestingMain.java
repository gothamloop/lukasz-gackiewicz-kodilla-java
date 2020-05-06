package com.kodilla.testing;

import com.kodilla.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        // tu umieść kolejny test ->
        System.out.println("Test - pierwszy test jednostkowy:");


        System.out.println("Rozpoczynam test klasy Calkulator:");

        if(Calculator.result_addSum == 9){
            System.out.println("Dodawanie działa poprawnie");
        } else {
            System.out.println("Dodawanie działa niepoprawnie");
        }

        if(Calculator.result_substractSum == 3){
            System.out.println("Odejmowanie działa poprawnie");
        } else {
            System.out.println("Odejmowanie działa niepoprawnie");
        }








    }
}