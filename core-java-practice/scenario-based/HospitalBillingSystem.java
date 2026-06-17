
class InsufficientFundsException extends Exception {
    public InsufficientFundsException(String msg) {
        super(msg);
    }
}

public class HospitalBillingSystem {

    static void processPayment(double bill, double amount)
            throws InsufficientFundsException {
        if (amount < bill) {
            throw new InsufficientFundsException("Insufficient funds for payment.");
        }
        System.out.println("Payment Successful");
    }

    public static void main(String[] args) {

        try {
            int items = 0;
            System.out.println(1000 / items);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero items.");
        }

        try {
            int[] patients = {1, 2, 3};
            System.out.println(patients[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Invalid patient index.");
        }

        try {
            int number = Integer.parseInt("ABC");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid numeric input.");
        }

        try {
            processPayment(5000, 3000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
