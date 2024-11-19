package com.perscholas.java.basics;

public class DoubleDivides {
    public  static  void main (String [] args){
        double num1 = 45.5;
        double num2 = 9.0;
        double larger = Math.max(num1, num2);
        double smaller = Math.min(num1, num2);

        double result = larger / smaller;
        System.out.println("Result of division (double): " + result);
        int intResult = (int) result;
        System.out.println("Result of division (integer): " + intResult);
    }
}
