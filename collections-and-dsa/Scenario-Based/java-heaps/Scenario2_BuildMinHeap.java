import java.util.*;
public class Scenario2_BuildMinHeap{
    static void down(int[]a,int i,int n){
        int s=i,l=2*i+1,r=2*i+2;
        if(l<n&&a[l]<a[s])s=l;
        if(r<n&&a[r]<a[s])s=r;
        if(s!=i){
            int t=a[i];
            a[i]=a[s];
            a[s]=t;
            down(a,s,n);
        }
    }
    public static void main(String[]x){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        for(int i=n/2-1;i>=0;i--)down(a,i,n);
        System.out.println(Arrays.toString(a));
    }
}