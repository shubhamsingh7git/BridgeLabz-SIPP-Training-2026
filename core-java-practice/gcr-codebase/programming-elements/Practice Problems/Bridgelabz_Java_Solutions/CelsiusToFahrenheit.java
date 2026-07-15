import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius = scanner.nextDouble();
        double fahrenheit = (celsius * 9.0 / 5.0) + 32;

        System.out.println("Fahrenheit = " + fahrenheit);

        scanner.close();
    }
}
