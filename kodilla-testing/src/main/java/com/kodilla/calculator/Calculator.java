package com.kodilla.calculator;

public class Calculator {

    public static int result_addSum;
    public static int result_subSum;

    public int add(int a, int b){
        result_addSum = a + b;
        return result_addSum;
    }

    public int subtract(int a, int b){
        result_subSum = a - b;
       return result_subSum;
    }
}