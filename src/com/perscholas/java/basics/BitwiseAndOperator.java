package com.perscholas.java.basics;

public class BitwiseAndOperator {
    public static void main (String arg[]){
        int x = 7;
        int y = 17;
        int z = x&y;
        System.out.println("x : " +x+"(binary: " +Integer.toBinaryString(x) + ")");
        System.out.println("y : " +y+"(binary: " +Integer.toBinaryString(x) + ")");
        System.out.println("z = x&y= " +z+"(binary: " +Integer.toBinaryString(z) + ")");
    }

}
