package com.perscholas.java.basics;

public class BinaryCode {
    public static void main(String[] args) {

        int[] numbers = {2, 9, 17, 88};

        for (int number : numbers) {
            int x = number;
            System.out.println("value of x: " + x);
            System.out.println("Binary: " + Integer.toBinaryString(x));


            x = x << 1;

            System.out.println("After left shift by 1:");
            System.out.println("Decimal value: " + x);
            System.out.println("Binary representation: " + Integer.toBinaryString(x));
            System.out.println("-----------");
        }
    }
}

