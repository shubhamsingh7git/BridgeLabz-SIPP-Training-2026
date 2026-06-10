import java.util.Scanner;

public class StoreNumbersAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0;
        int index = 0;

        while (true) {
            double value = sc.nextDouble();

            if (value <= 0 || index == 10) {
                break;
            }

            numbers[index++] = value;
        }

        for (int i = 0; i < index; i++) {
            System.out.println(numbers[i]);
            total += numbers[i];
        }

        System.out.println("Sum = " + total);
        sc.close();
    }
}