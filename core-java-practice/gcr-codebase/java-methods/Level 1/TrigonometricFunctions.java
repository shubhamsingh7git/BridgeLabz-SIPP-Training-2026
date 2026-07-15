
import java.util.*;
public class TrigonometricFunctions{
static double[] calculateTrigonometricFunctions(double angle){double r=Math.toRadians(angle);return new double[]{Math.sin(r),Math.cos(r),Math.tan(r)};}
public static void main(String[] a){Scanner sc=new Scanner(System.in);double[] r=calculateTrigonometricFunctions(sc.nextDouble());System.out.println("Sin="+r[0]+" Cos="+r[1]+" Tan="+r[2]);}
}