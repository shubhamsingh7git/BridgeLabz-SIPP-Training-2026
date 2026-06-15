
import java.util.*;
public class SimpleInterest{
static double calculate(double p,double r,double t){return p*r*t/100;}
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double p=sc.nextDouble(),r=sc.nextDouble(),t=sc.nextDouble();
System.out.println("The Simple Interest is "+calculate(p,r,t)+" for Principal "+p+", Rate of Interest "+r+" and Time "+t);
}}