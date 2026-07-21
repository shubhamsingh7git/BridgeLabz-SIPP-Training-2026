import java.util.*;
public class Scenario5_KthLargest{
    public static void main(String[]x){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]a=new int[n];
        for(int i=0;i<n;i++)a[i]=sc.nextInt();
        int k=sc.nextInt();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int v:a){
            if(pq.size()<k)pq.offer(v);
            else if(v>pq.peek()){
                pq.poll();
                pq.offer(v);
            }
        }
        System.out.println(pq.peek());
    }
}