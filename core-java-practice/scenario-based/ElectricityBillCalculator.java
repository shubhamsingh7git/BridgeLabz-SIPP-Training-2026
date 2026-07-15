import java.util.Scanner;

public class ElectricityBillCalculator {

    public static int acceptUnits() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        return sc.nextInt();
    }

    public static double calculateBill(int units) {
        double bill;

        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 300) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (200 * 7) + ((units - 300) * 10);
        }

        return bill;
    }

    public static void displayBill(String customerName, int units, double billAmount) {
        System.out.println("\\n----- Electricity Bill -----");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Units Consumed: " + units);
        System.out.println("Bill Amount   : Rs. " + billAmount);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter customer name: ");
        String customerName = sc.nextLine();

        int units = acceptUnits();
        double billAmount = calculateBill(units);

        displayBill(customerName, units, billAmount);
    }
}