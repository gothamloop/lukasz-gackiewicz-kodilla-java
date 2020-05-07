package com.kodilla.testing.collection;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

public class OddNumbersExterminator {
     public ArrayList<Integer> exterminate(@NotNull ArrayList<Integer> numbers) {

            //ArrayList<Integer> numbers = new ArrayList<Integer>();
            numbers.add(2);
            numbers.add(3);
            numbers.add(4);
            numbers.add(5);
            numbers.add(6);
            numbers.add(3);
            numbers.add(3);
            numbers.add(4);

            ArrayList<Integer> numbersEven = new ArrayList<Integer>();


            for(int n=0; n < numbers.size(); n++) {
                if(n % 2 == 0){

                    System.out.println("Element parzysty (even) " + n);
                    numbersEven.add(n);
                }
            }System.out.println(numbersEven);
        }












}
