package com.kodilla.exception.test;

public class FirstChallenge {

    public static double divide(double a, double b) throws ArithmeticException {
        if(b == 0 || a == 0){
            throw new ArithmeticException();
        }
        return a / b;
    }

    /**
     * This main can throw an ArithmeticException!!!
     * @param args
     */
    public static void main(String[] args) {

     /*   FirstChallenge firstChallenge = new FirstChallenge();
        double result = firstChallenge.divide(3, 0);
        System.out.println(result);
*/
        double result=0;
        try{
            result = FirstChallenge.divide(3, 0);
        } catch (ArithmeticException e) {
            System.out.println("You should not divide a number by zero or zero by a number! " + e);
        } finally {
            System.out.println(result);
        }
    }
}


