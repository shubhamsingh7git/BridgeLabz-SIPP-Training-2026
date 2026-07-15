import java.util.Scanner;

public class UsernameValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        boolean hasSpaces = username.contains(" ");
        int length = username.length();
        String upperCase = username.toUpperCase();

        String reversed = new StringBuilder(username).reverse().toString();
        boolean palindrome = username.equalsIgnoreCase(reversed);

        System.out.println("\n--- Username Report ---");
        System.out.println("Contains Spaces: " + hasSpaces);
        System.out.println("Total Characters: " + length);
        System.out.println("Uppercase Username: " + upperCase);
        System.out.println("Palindrome: " + palindrome);
    }
}