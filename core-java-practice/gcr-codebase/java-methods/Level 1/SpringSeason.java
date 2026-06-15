
import java.util.*;
public class SpringSeason{
static boolean isSpring(int m,int d){return (m==3&&d>=20)||(m>3&&m<6)||(m==6&&d<=20);}
public static void main(String[] a){Scanner sc=new Scanner(System.in);System.out.println(isSpring(sc.nextInt(),sc.nextInt())?"Its a Spring Season":"Not a Spring Season");}
}