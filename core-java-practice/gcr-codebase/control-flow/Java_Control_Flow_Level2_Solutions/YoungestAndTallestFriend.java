import java.util.Scanner;
public class YoungestAndTallestFriend {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int amarAge = input.nextInt();
        int akbarAge = input.nextInt();
        int anthonyAge = input.nextInt();
        double amarHeight = input.nextDouble();
        double akbarHeight = input.nextDouble();
        double anthonyHeight = input.nextDouble();

        String youngest;
        int minAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (minAge == amarAge) youngest = "Amar";
        else if (minAge == akbarAge) youngest = "Akbar";
        else youngest = "Anthony";

        String tallest;
        double maxHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (maxHeight == amarHeight) tallest = "Amar";
        else if (maxHeight == akbarHeight) tallest = "Akbar";
        else tallest = "Anthony";

        System.out.println("Youngest: " + youngest);
        System.out.println("Tallest: " + tallest);
        input.close();
    }
}