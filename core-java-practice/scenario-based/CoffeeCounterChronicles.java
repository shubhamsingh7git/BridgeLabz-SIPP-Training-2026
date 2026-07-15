import java.util.Scanner;

public class CoffeeCounterChronicles {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter coffee type (Espresso, Latte, Cappuccino) or exit: ");
            String coffeeType = sc.nextLine();

            if (coffeeType.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Enter quantity: ");
            int quantity = sc.nextInt();
            sc.nextLine();

            double price = 0;

            switch (coffeeType.toLowerCase()) {
                case "espresso":
                    price = 120;
                    break;
                case "latte":
                    price = 150;
                    break;
                case "cappuccino":
                    price = 180;
                    break;
                default:
                    System.out.println("Invalid coffee type.");
                    continue;
            }

            double billAmount = price * quantity;
            double gst = billAmount * 0.18;
            double totalBill = billAmount + gst;

            System.out.println("Total Bill = ₹" + totalBill);
        }

        sc.close();
    }
}