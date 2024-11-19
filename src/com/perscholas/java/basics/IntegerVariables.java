package com.perscholas.java.basics;

public class IntegerVariables {
    public static void main(String []args){
        int x = 5;
        int y = 6;
        int q = y / x;
        System.out.println("Result of y / x (integer division): " + q);
        double qDouble = (double) y / x;
        System.out.println("Result of y / x (with casting y to double): " + qDouble);
    }

}

