import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double physics = input.nextDouble();
        double chemistry = input.nextDouble();
        double maths = input.nextDouble();
        double percentage = (physics + chemistry + maths) / 3.0;
        String grade;
        String remarks;
        if (percentage >= 80) {
            grade = "A";
            remarks = "Level 4";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "Level 3";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "Level 2";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "Level 1";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "Below Level 1";
        } else {
            grade = "R";
            remarks = "Remedial";
        }
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);
        input.close();
    }
}