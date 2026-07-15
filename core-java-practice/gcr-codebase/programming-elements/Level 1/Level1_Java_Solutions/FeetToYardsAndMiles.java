import java.util.Scanner;

public class FeetToYardsAndMiles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double feet = scanner.nextDouble();
        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards is " + yards +
                " and in miles is " + miles);

        scanner.close();
    }
}
