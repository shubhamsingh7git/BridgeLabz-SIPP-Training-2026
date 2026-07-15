import java.util.Scanner;
public class MultiplesBelow100ForLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = number; i < 100; i += number) {
            System.out.println(i);
        }
        input.close();
    }
}