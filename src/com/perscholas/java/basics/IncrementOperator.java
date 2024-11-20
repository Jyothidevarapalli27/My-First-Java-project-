package com.perscholas.java.basics;

public class IncrementOperator {
    public static void main (String [] args){

        int x = 5;
        int y = 8;

        int sum  = ++x + y;
        System.out.println("pre fix increment (++x): ");
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("sum = " + sum);

        x = 5;

        sum = x++ + y;
        System.out.println("\npostfix increment:  (x++)" );
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("sum = " + sum);

    }

}
