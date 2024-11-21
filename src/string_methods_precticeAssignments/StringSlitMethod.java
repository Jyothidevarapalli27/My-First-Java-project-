package string_methods_precticeAssignments;

import java.util.Arrays;

public class StringSlitMethod {
    public static void main (String[]args){
        String vowels =  "a::b::c::d:e";
        String[] result = vowels.split("::");
        System.out.println("result = " + Arrays.toString(result));

    }
}

