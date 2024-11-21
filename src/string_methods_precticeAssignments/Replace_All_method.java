package string_methods_precticeAssignments;

public class Replace_All_method {
    public static void main(String[]args){
        String str = "Java123is";
        String regex = "\\d+";
        System.out.println(str.replaceAll(regex,""));
    }
}
