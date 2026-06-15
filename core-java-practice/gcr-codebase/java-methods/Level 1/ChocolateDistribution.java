
import java.util.*;
public class ChocolateDistribution{
static int[] findRemainderAndQuotient(int n,int d){return new int[]{n/d,n%d};}
public static void main(String[] a){Scanner sc=new Scanner(System.in);int[] r=findRemainderAndQuotient(sc.nextInt(),sc.nextInt());System.out.println("Each Child="+r[0]+" Remaining="+r[1]);}
}