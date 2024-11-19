
package com.perscholas.java.basics;

import java.util.Scanner;

public class Input {
    public static void main (String [] args){
        Scanner scanner = new Scanner (System.in);
        int i = scanner.nextInt();
        String s = scanner.next();
        //scanner.nextLine();
        double d = scanner.nextDouble();

        System.out.println(s);
        System.out.println(d);
        System.out.println(i);
        scanner.close();
    }
}



