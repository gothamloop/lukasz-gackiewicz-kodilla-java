package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
     public static ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
            ArrayList<Integer> numbersEven = new ArrayList<Integer>();

            for(int n : numbers) {
                if(n % 2 == 0){
                   numbersEven.add(n);
                }
            }
      return numbersEven;
     }
}


