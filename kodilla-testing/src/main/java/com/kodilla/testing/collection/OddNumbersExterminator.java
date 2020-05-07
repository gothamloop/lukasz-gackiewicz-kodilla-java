package com.kodilla.testing.collection;

import java.util.ArrayList;

public class OddNumbersExterminator {
     public ArrayList<Integer> exterminate(ArrayList<Integer> numbers) {
            ArrayList<Integer> numbersEven = new ArrayList<Integer>();

            for(int n=0; n < numbers.size(); n++) {
                if(n % 2 == 0){
                   numbersEven.add(n);
                }
            }
      return numbersEven;
     }
}
