
import java.util.*;
public class NumberSignCheck{
static int sign(int n){return n>0?1:n<0?-1:0;}
public static void main(String[] a){Scanner sc=new Scanner(System.in);System.out.println(sign(sc.nextInt()));}
}