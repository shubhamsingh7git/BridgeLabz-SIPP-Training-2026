
import java.util.*;
public class SmallestLargest{
static int[] findSmallestAndLargest(int a,int b,int c){return new int[]{Math.min(a,Math.min(b,c)),Math.max(a,Math.max(b,c))};}
public static void main(String[] x){Scanner sc=new Scanner(System.in);int[] r=findSmallestAndLargest(sc.nextInt(),sc.nextInt(),sc.nextInt());System.out.println("Smallest="+r[0]+" Largest="+r[1]);}
}