package com.perscholas.java.basics;

public class ScannerExample {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("a: " + a);

        String b = scanner.next();
        System.out.println("b: " + b);
    }
}




