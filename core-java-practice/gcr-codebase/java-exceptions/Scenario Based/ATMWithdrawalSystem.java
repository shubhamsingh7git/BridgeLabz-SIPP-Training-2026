
class InsufficientBalanceException extends Exception {
    private double balance;
    private double requested;

    public InsufficientBalanceException(double balance, double requested) {
        super("Insufficient balance!");
        this.balance = balance;
        this.requested = requested;
    }

    public String getDetails() {
        return "Balance: " + balance + ", Requested: " + requested;
    }
}

public class ATMWithdrawalSystem {
    public static void withdraw(double balance, double amount)
            throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        System.out.println("Withdrawal successful");
    }

    public static void main(String[] args) {
        try {
            withdraw(5000, 8000);
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
            System.out.println(e.getDetails());
        }
    }
}
