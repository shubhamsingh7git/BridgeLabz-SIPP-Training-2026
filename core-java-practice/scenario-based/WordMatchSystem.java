import java.util.Arrays;
import java.util.Scanner;

public class WordMatchSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first skill: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second skill: ");
        String str2 = sc.nextLine();

        String s1 = str1.replaceAll("\\s+", "").toLowerCase();
        String s2 = str2.replaceAll("\\s+", "").toLowerCase();

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean anagram = Arrays.equals(arr1, arr2);

        System.out.println("\n--- Skill Match Report ---");
        System.out.println("First Skill (Uppercase): " + str1.toUpperCase());
        System.out.println("Second Skill (Uppercase): " + str2.toUpperCase());
        System.out.println("Length of First Skill: " + str1.length());
        System.out.println("Length of Second Skill: " + str2.length());

        if (anagram) {
            System.out.println("Result: Both strings are anagrams.");
        } else {
            System.out.println("Result: Strings are not anagrams.");
        }
    }
}