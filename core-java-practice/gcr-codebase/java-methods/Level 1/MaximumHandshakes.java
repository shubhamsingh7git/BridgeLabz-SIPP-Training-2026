
import java.util.*;
public class MaximumHandshakes{
static int handshakes(int n){return n*(n-1)/2;}
public static void main(String[] a){Scanner sc=new Scanner(System.in);int n=sc.nextInt();System.out.println(handshakes(n));}
}