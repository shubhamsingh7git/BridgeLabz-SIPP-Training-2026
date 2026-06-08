import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double exponent = scanner.nextDouble();

        System.out.println("Result = " + Math.pow(base, exponent));

        scanner.close();
    }
}
