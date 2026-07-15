import java.util.Scanner;

public class RestaurantBillingSystem {

    public static double calculateFoodCost(double price, int quantity) {
        return price * quantity;
    }

    public static double calculateGST(double foodCost) {
        return foodCost * 0.05;
    }

    public static double calculateDiscount(double amount) {
        if (amount >= 2000) {
            return amount * 0.10;
        } else if (amount >= 1000) {
            return amount * 0.05;
        }
        return 0;
    }

    public static double generateFinalBill(double foodCost, double gst, double discount) {
        return foodCost + gst - discount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter food item name: ");
        String itemName = sc.nextLine();

        System.out.print("Enter price per item: ");
        double price = sc.nextDouble();

        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();

        double foodCost = calculateFoodCost(price, quantity);
        double gst = calculateGST(foodCost);
        double discount = calculateDiscount(foodCost);
        double finalBill = generateFinalBill(foodCost, gst, discount);

        System.out.println("\\n----- Restaurant Bill -----");
        System.out.println("Item Name      : " + itemName);
        System.out.println("Food Cost      : Rs. " + foodCost);
        System.out.println("GST (5%)       : Rs. " + gst);
        System.out.println("Discount       : Rs. " + discount);
        System.out.println("Payable Amount : Rs. " + finalBill);
    }
}