import java.util.*;
public class Scenario3_HeapSort{
    static void h(int[]a,int n,int i){
        int l=2*i+1,r=2*i+2,m=i;
        if(l<n&&a[l]>a[m])m=l;
        if(r<n&&a[r]>a[m])m=r;
        if(m!=i){
            int t=a[i];
            a[i]=a[m];
            a[m]=t;
            h(a,n,m);
        }
    }
    public static void main(String[]x){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=n/2-1;i>=0;i--)h(a,n,i);
        for(int e=n-1;e>0;e--){
            int t=a[0];
            a[0]=a[e];
            a[e]=t;
            h(a,e,0);
        }
        System.out.println(Arrays.toString(a));
    }
}