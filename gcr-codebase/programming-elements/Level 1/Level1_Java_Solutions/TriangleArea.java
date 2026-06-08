import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double base = scanner.nextDouble();
        double height = scanner.nextDouble();

        double area = 0.5 * base * height;

        System.out.println("Area of triangle is " + area);

        scanner.close();
    }
}
