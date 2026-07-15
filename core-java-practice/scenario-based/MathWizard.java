
public class MathWizard {
    int instanceVariable = 100;

    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) fact *= i;
        return fact;
    }

    double factorial(double n) {
        double fact = 1;
        for (int i = 1; i <= (int)n; i++) fact *= i;
        return fact;
    }

    int fibonacci(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    int gcd(int a, int b) {
        while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return a;
    }

    int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }

    long power(int base, int exp) {
        long result = 1;
        for (int i = 0; i < exp; i++) result *= base;
        return result;
    }

    void showScope() {
        int localVariable = 50;
        System.out.println("Instance Variable: " + instanceVariable);
        System.out.println("Local Variable: " + localVariable);
    }

    public static void main(String[] args) {
        MathWizard m = new MathWizard();
        System.out.println("Prime: " + m.isPrime(17));
        System.out.println("Factorial: " + m.factorial(5));
        System.out.println("Factorial(double): " + m.factorial(5.0));
        System.out.println("Fibonacci: " + m.fibonacci(8));
        System.out.println("GCD: " + m.gcd(20, 30));
        System.out.println("LCM: " + m.lcm(20, 30));
        System.out.println("Power: " + m.power(2, 5));
        m.showScope();
    }
}
