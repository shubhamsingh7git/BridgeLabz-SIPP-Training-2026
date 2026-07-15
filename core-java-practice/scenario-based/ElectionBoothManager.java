import java.util.Scanner;

public class ElectionBoothManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int candidate1Votes = 0;
        int candidate2Votes = 0;
        int candidate3Votes = 0;

        while (true) {
            System.out.print("Enter age (-1 to exit): ");
            int age = sc.nextInt();

            if (age == -1) {
                break;
            }

            if (age < 18) {
                System.out.println("Not eligible to vote.");
                continue;
            }

            System.out.print("Enter vote (1,2,3): ");
            int vote = sc.nextInt();

            switch (vote) {
                case 1:
                    candidate1Votes++;
                    break;
                case 2:
                    candidate2Votes++;
                    break;
                case 3:
                    candidate3Votes++;
                    break;
                default:
                    System.out.println("Invalid vote.");
            }
        }

        System.out.println("Candidate A Votes: " + candidate1Votes);
        System.out.println("Candidate B Votes: " + candidate2Votes);
        System.out.println("Candidate C Votes: " + candidate3Votes);

        sc.close();
    }
}