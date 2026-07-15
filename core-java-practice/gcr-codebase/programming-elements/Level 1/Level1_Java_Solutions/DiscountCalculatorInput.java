import java.util.Scanner;

public class DiscountCalculatorInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double fee = scanner.nextDouble();
        double discountPercent = scanner.nextDouble();

        double discount = fee * discountPercent / 100;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR " + discount +
                " and final discounted fee is INR " + finalFee);

        scanner.close();
    }
}
