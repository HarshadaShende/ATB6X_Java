package ex_11042024;

public class Lab008 {
    public static void main(String[] args) {
        System.out.println("Rules to define identifiers");
        // Identifier can contain alphabets, digits, 2 special symbols: dollar $ and underscore _
        // First character of an identifier must be an alphabet or $ or _
        // Keywords or Reserved words cant be used as identifier
        // Valid Identifiers - Hello, Int, getClassName, studentEmail, TOTAL_FFE
        // Invalid Identifiers - 1stClass, true, student number, student-email, int

        System.out.println("Variables");
        int age = 65;
        System.out.println(age);
        age = 70;
        age = -1;
        age = age + 1;
        System.out.println(age);
        double age1 = 90.80;
        System.out.println(age1);

    }
}
