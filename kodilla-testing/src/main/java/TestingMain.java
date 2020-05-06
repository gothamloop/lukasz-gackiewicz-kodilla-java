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

        System.out.println("Rozpoczynam test klasy Calkulator:");
        Calculator calculator = new Calculator();
        int result_addSum = calculator.add(4, 5);
        int result_substractSum = calculator.substract(10, 7);
        if(Calculator.result_addSum == 9 && Calculator.result_substractSum == 3){
            System.out.println("Kalkulator działa poprawnie");
        } else {
            System.out.println("Kalkulator działa niepoprawnie");
        }









    }
}