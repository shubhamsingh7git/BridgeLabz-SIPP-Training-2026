import java.util.Scanner;

public class StudentScoreCard {

    public static int[][] generateMarks(int students) {
        int[][] marks = new int[students][3];

        for (int i = 0; i < students; i++) {
            for (int j = 0; j < 3; j++) {
                marks[i][j] = 10 + (int)(Math.random() * 90);
            }
        }

        return marks;
    }

    public static double[][] calculateResults(int[][] marks) {

        double[][] result = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {

            int total = marks[i][0] + marks[i][1] + marks[i][2];

            double average = Math.round((total / 3.0) * 100.0) / 100.0;

            double percentage = Math.round((total / 300.0 * 100) * 100.0) / 100.0;

            result[i][0] = total;
            result[i][1] = average;
            result[i][2] = percentage;
        }

        return result;
    }

    public static void displayScoreCard(int[][] marks, double[][] result) {

        System.out.println("----------------------------------------------------------------------------");
        System.out.println("Stu\tPhy\tChem\tMath\tTotal\tAverage\tPercentage");
        System.out.println("----------------------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {

            System.out.printf("%d\t%d\t%d\t%d\t%.0f\t%.2f\t\t%.2f%%%n",
                    i + 1,
                    marks[i][0],
                    marks[i][1],
                    marks[i][2],
                    result[i][0],
                    result[i][1],
                    result[i][2]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number of Students: ");
        int students = sc.nextInt();

        int[][] marks = generateMarks(students);

        double[][] result = calculateResults(marks);

        displayScoreCard(marks, result);

        sc.close();
    }
}
