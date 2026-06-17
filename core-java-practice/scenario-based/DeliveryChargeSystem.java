import java.util.Scanner;

public class DeliveryChargeSystem {

    public static double calculateCharge(int distance) {
        return distance * 5;
    }

    public static double calculateCharge(int distance, int weight) {
        return (distance * 5) + (weight * 10);
    }

    public static double calculateCharge(int distance, int weight, boolean expressDelivery) {
        double charge = (distance * 5) + (weight * 10);

        if (expressDelivery) {
            charge += 100;
        }

        return charge;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        int distance = sc.nextInt();

        System.out.print("Enter package weight (kg): ");
        int weight = sc.nextInt();

        System.out.print("Express Delivery (true/false): ");
        boolean express = sc.nextBoolean();

        System.out.println("\\nDelivery Charge Calculations");
        System.out.println("Distance Only               : Rs. " +
                calculateCharge(distance));

        System.out.println("Distance + Weight           : Rs. " +
                calculateCharge(distance, weight));

        System.out.println("Distance + Weight + Express : Rs. " +
                calculateCharge(distance, weight, express));
    }
}