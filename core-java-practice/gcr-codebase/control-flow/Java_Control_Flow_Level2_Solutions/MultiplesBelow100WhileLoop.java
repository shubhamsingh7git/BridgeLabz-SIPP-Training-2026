import java.util.Scanner;
public class MultiplesBelow100WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int multiple = number;
        while (multiple < 100) {
            System.out.println(multiple);
            multiple += number;
        }
        input.close();
    }
}