public class Problem7_Power{
    static long power(int x,int n){ return n==0?1:x*power(x,n-1); }
    public static void main(String[] args){ System.out.println(power(2,5)); }
}