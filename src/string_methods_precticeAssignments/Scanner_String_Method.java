package string_methods_precticeAssignments;

import java.util.Scanner;

public class Scanner_String_Method {
    public static void main (String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a char: ");
        String s = input.next();
        char ch = s.charAt(0);
        System.out.println("Enter char entered is: " +ch);
    }
}
