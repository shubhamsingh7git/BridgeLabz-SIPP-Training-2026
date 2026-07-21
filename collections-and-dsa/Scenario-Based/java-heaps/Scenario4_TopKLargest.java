import java.util.*;
public class Scenario4_TopKLargest{
    public static void main(String[]x){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++){
            int v=sc.nextInt();
            if(pq.size()<3){
                pq.offer(v);
            } else if(v>pq.peek()){
                pq.poll();
                pq.offer(v);
            }
        }
        System.out.println(new ArrayList<>(pq));
    }
}