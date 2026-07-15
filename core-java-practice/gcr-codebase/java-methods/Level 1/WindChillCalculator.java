
import java.util.*;
public class WindChillCalculator{
static double calculateWindChill(double t,double v){return 35.74+0.6215*t-35.75*Math.pow(v,0.16)+0.4275*t*Math.pow(v,0.16);}
public static void main(String[] a){Scanner sc=new Scanner(System.in);System.out.println(calculateWindChill(sc.nextDouble(),sc.nextDouble()));}
}