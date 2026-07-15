import java.util.Scanner;

public class CinemaSeatAnalyzer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total number of seats: ");
        int n = sc.nextInt();

        int[] seats = new int[n];

        System.out.println("Enter seat status (0 = Empty, 1 = Booked):");
        for (int i = 0; i < n; i++) {
            seats[i] = sc.nextInt();
        }

        int booked = 0;
        int available = 0;

        int maxLength = 0;
        int maxStart = -1;
        int maxEnd = -1;

        int currentStart = -1;
        int currentLength = 0;

        for (int i = 0; i < n; i++) {
            if (seats[i] == 1) {
                booked++;

                if (currentLength > maxLength) {
                    maxLength = currentLength;
                    maxStart = currentStart;
                    maxEnd = i - 1;
                }

                currentLength = 0;
            } else {
                available++;

                if (currentLength == 0) {
                    currentStart = i;
                }

                currentLength++;
            }
        }

        if (currentLength > maxLength) {
            maxLength = currentLength;
            maxStart = currentStart;
            maxEnd = n - 1;
        }

        System.out.println("\\nTotal Booked Seats: " + booked);
        System.out.println("Total Available Seats: " + available);

        System.out.println("\\nLongest Continuous Available Block:");
        System.out.println("Starting Position: " + (maxStart + 1));
        System.out.println("Ending Position: " + (maxEnd + 1));
        System.out.println("Block Length: " + maxLength);

        if (maxLength >= 5) {
            System.out.println("\\nA group of 5 people CAN sit together.");
        } else {
            System.out.println("\\nA group of 5 people CANNOT sit together.");
        }
    }
}