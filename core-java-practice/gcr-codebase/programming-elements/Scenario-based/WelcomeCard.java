public class WelcomeCard {
    public static void main(String[] args) {
        String name = "Ravi";
        int age = 21;
        String rank = "Beginner";
        double salary = 50000;
        float membershipFee = 999.99f;

        int annualBonus = (int) (salary * 0.12);

        System.out.println("===== WELCOME CARD =====");
        System.out.println("Name           : " + name);
        System.out.println("Age            : " + age);
        System.out.println("Rank           : " + rank);
        System.out.println("Salary         : " + salary);
        System.out.println("Membership Fee : " + membershipFee);
        System.out.println("Annual Bonus   : " + annualBonus);
        System.out.println("========================");
    }
}
