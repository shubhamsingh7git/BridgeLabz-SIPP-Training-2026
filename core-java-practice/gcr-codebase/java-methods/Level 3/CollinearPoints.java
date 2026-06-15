import java.util.Scanner;

public class CollinearPoints {

    public static boolean areCollinearBySlope(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        return (y2 - y1) * (x3 - x2) == (y3 - y2) * (x2 - x1);
    }

    public static double triangleArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        return Math.abs(
                x1 * (y2 - y3)
              + x2 * (y3 - y1)
              + x3 * (y1 - y2)
        ) / 2.0;
    }

    public static boolean areCollinearByArea(
            double x1, double y1,
            double x2, double y2,
            double x3, double y3) {

        return triangleArea(x1, y1, x2, y2, x3, y3) == 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x1 y1: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();

        System.out.print("Enter x2 y2: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();

        System.out.print("Enter x3 y3: ");
        double x3 = sc.nextDouble();
        double y3 = sc.nextDouble();

        System.out.println("\nUsing Slope Method: "
                + areCollinearBySlope(x1, y1, x2, y2, x3, y3));

        System.out.println("Triangle Area: "
                + triangleArea(x1, y1, x2, y2, x3, y3));

        System.out.println("Using Area Method: "
                + areCollinearByArea(x1, y1, x2, y2, x3, y3));

        sc.close();
    }
}
