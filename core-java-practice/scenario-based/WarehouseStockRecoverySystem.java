import java.util.Scanner;

public class WarehouseStockRecoverySystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of products: ");
        int n = sc.nextInt();

        int[] stock = new int[n];

        System.out.println("Enter stock quantities:");
        for (int i = 0; i < n; i++) {
            stock[i] = sc.nextInt();
        }

        int zeroPosition = -1;
        int sum = 0;
        int count = 0;

        for (int i = 0; i < n; i++) {
            if (stock[i] == 0) {
                zeroPosition = i;
            } else {
                sum += stock[i];
                count++;
            }
        }

        int averageStock = sum / count;
        stock[zeroPosition] = averageStock;

        System.out.println("\\nMissing Stock Found At Position: " + (zeroPosition + 1));
        System.out.println("Recovered Stock Value: " + averageStock);

        System.out.println("\\nUpdated Inventory:");
        for (int value : stock) {
            System.out.print(value + " ");
        }
    }
}