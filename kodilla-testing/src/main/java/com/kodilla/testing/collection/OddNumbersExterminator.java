package com.kodilla.testing.collection;

import org.jetbrains.annotations.NotNull;
import java.util.ArrayList;

public class OddNumbersExterminator {
     public ArrayList<Integer> exterminate(@NotNull ArrayList<Integer> numbers) {
            ArrayList<Integer> numbersEven = new ArrayList<Integer>();

            for(int n=0; n < numbers.size(); n++) {
                if(n % 2 == 0){
                   numbersEven.add(n);
                }
            }
      return numbersEven;
     }
}
