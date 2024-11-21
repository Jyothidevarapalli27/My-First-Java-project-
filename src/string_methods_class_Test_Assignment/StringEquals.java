package string_methods_class_Test_Assignment;

public class StringEquals {

        public static void main(String[] args) {
            String str1 = "Hello";
            String str2 = "hello";
            boolean isEqual = str1.equals(str2);
            System.out.println("Are the strings equal " + isEqual);

            boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);
            System.out.println("Are the strings equal " + isEqualIgnoreCase);

        }
}
