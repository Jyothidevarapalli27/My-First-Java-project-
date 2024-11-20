package com.perscholas.java.basics;

public class Bitwise_Or_Operator {
    public static void main (String args[]){
                int x = 7;
                int y = 17;
                int z = x|y;

                System.out.println("x : " +x+"(binary: " +Integer.toBinaryString(x) + ")");
                System.out.println("y : " +y+"(binary: " +Integer.toBinaryString(x) + ")");
                System.out.println("z = x|y= " +z+"(binary: " +Integer.toBinaryString(z) + ")");
    }

}

