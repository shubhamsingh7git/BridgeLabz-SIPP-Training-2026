import java.util.Scanner;

public class SpyAgencyMessageAnalyzer {

    public static String reverseMessage(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }
        return reversed;
    }

    public static boolean isPalindrome(String text) {
        int left = 0;
        int right = text.length() - 1;

        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void countVowelsAndConsonants(String text) {
        int vowels = 0;
        int consonants = 0;

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
    }

    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        int[] frequency = new int[256];

        for (int i = 0; i < s1.length(); i++) {
            frequency[s1.charAt(i)]++;
            frequency[s2.charAt(i)]--;
        }

        for (int count : frequency) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }

    public static char firstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];

        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Secret Message: ");
        String message = sc.nextLine();

        System.out.println("Reversed Message: " + reverseMessage(message));
        System.out.println("Palindrome: " + isPalindrome(message));

        countVowelsAndConsonants(message);

        System.out.print("Enter First Intercept: ");
        String intercept1 = sc.nextLine();

        System.out.print("Enter Second Intercept: ");
        String intercept2 = sc.nextLine();

        System.out.println("Anagram Check: " + areAnagrams(intercept1, intercept2));

        System.out.print("Enter Surveillance Log: ");
        String log = sc.nextLine();

        char result = firstNonRepeatingCharacter(log);

        if (result != '\0') {
            System.out.println("First Non-Repeating Character: " + result);
        } else {
            System.out.println("No Non-Repeating Character Found");
        }

        sc.close();
    }
}
