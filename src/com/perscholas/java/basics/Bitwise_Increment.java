package com.perscholas.java.basics;

public class Bitwise_Increment {
    public static void main (String[]args){
        int number = 10;
        System.out.println("value: " + number);

        number++;
        System.out.println("after postfix (number++): " + number);

        ++number;
        System.out.println("after prefix (++number): " + number);

        number += 1;
        System.out.println("after adding (number += 1: " +number);

        System.out.println("\nIncrementing multiple times: ");
        System.out.println("using postfix: " + (number++));
        System.out.println("using prefix: " + (++number));

        number += 1;
        System.out.println("using addition assignment: " + number);

    }
}
