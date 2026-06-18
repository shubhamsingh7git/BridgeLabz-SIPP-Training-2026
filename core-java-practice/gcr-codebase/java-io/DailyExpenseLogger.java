import java.io.*;
import java.util.Scanner;

public class DailyExpenseLogger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter category: ");
        String category = sc.nextLine();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("expenses.txt", true))) {
            bw.write(category + " - " + amount);
            bw.newLine();
            System.out.println("Expense saved.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}