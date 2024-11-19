package com.perscholas.java.basics;

public class BinaryShift {

    public static void main (String [] args){

        int x = 150;
        System.out.println("x value: " +x);
        System.out.println("binary value x : " +  Integer.toBinaryString(x));

        x = x >> 2;

        System.out.println("after x right shift by 2: " + 2);
        System.out.println("binary x: " + Integer.toBinaryString(x));
        System.out.println();

        x = 225;

        System.out.println("x value: " + x);
        System.out.println("binary x: " + Integer.toBinaryString(x));

        x = x >> 2;
        System.out.println("after x right shift by 2: " + 2);
        System.out.println("binary x: " + Integer.toBinaryString(x));


    }

}
