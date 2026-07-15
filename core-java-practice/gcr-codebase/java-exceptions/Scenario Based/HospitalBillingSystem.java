
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBillingSystem {
    public static void main(String[] args) {

        try {
            int items = 0;
            System.out.println(1000 / items);
        } catch (ArithmeticException e) {
            System.out.println("Error: Bill contains zero items.");
        }

        try {
            int[] patients = {101,102,103};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int value = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            throw new InsufficientFundsException("Payment failed: Insufficient funds.");
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
