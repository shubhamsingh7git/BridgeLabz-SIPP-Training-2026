import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double distanceInFeet = scanner.nextDouble();

        double yards = distanceInFeet / 3;
        double miles = yards / 1760;

        System.out.println("The distance in yards is " + yards +
                " while the distance in miles is " + miles);

        scanner.close();
    }
}
