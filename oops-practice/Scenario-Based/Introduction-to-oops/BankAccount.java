
public class BankAccount {

    private String accountNumber;
    private String holder;
    private double balance;

    private static int totalAccounts = 0;

    public BankAccount(String accountNumber, String holder, double balance) {
        this.accountNumber = accountNumber;
        this.holder = holder;
        this.balance = balance;
        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount > 0) balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient balance");
    }

    public void getStatement() {
        System.out.println(accountNumber + " " + holder + " " + balance);
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("ACC101","Rahul",10000);
        BankAccount a2 = new BankAccount("ACC102","Priya",15000);
        BankAccount a3 = new BankAccount("ACC103","Aman",20000);

        a1.deposit(1000); a1.withdraw(500); a1.deposit(200); a1.withdraw(300); a1.deposit(400);
        a2.deposit(1000); a2.withdraw(500); a2.deposit(200); a2.withdraw(300); a2.deposit(400);
        a3.deposit(1000); a3.withdraw(500); a3.deposit(200); a3.withdraw(300); a3.deposit(400);

        a1.getStatement();
        a2.getStatement();
        a3.getStatement();

        System.out.println("Total Accounts = " + getTotalAccounts());
    }
}
