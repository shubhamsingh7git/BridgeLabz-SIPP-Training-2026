
import java.util.Scanner;

public class KingdomTaxCalculator {

    public static double calculateTax(double income) {
        if (income < 10000) {
            return income * 0.05;
        } else if (income <= 50000) {
            return income * 0.15;
        } else {
            return income * 0.30;
        }
    }

    public static String getTaxBracket(double income) {
        if (income < 10000) {
            return "5% Tax Bracket";
        } else if (income <= 50000) {
            return "15% Tax Bracket";
        } else {
            return "30% Tax Bracket";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter income of a citizen: ");
        double income = scanner.nextDouble();

        double tax = calculateTax(income);

        System.out.println("Tax Bracket: " + getTaxBracket(income));
        System.out.println("Tax Amount: " + tax);

        double totalTaxCollected = 0;

        System.out.println("\nEnter income of 10 citizens:");

        for (int i = 1; i <= 10; i++) {
            System.out.print("Citizen " + i + ": ");
            double citizenIncome = scanner.nextDouble();

            totalTaxCollected += calculateTax(citizenIncome);
        }

        System.out.println("\nTotal Tax Collected from 10 Citizens: " + totalTaxCollected);

        scanner.close();
    }
}
