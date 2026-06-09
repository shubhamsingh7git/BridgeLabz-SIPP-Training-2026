import java.util.Scanner;
public class DigitCount {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = Math.abs(input.nextInt());
        int count = 0;
        if (number == 0) count = 1;
        while (number != 0) {
            count++;
            number /= 10;
        }
        System.out.println(count);
        input.close();
    }
}