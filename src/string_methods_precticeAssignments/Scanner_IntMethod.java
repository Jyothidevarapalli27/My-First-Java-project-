package string_methods_precticeAssignments;

import java.util.Scanner;

public class Scanner_IntMethod {
    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three words separate by spaces: ");
        String str1 = input.next();
        String str2 = input.next();
        String str3 = input.next();
        System.out.println("str1 is " + str1);
        System.out.println("str2 is " + str2);
        System.out.println("str3 is " + str3 );
    }
}
