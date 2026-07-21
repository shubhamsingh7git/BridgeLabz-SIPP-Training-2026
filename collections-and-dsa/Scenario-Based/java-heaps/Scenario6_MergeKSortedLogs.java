import java.util.*;
public class Scenario6_MergeKSortedLogs{
    static class E{
        int v,l,i;
        E(int v,int l,int i){
            this.v=v;
            this.l=l;
            this.i=i;
        }
    }
    public static void main(String[]x){
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        List<List<Integer>>lists=new ArrayList<>();
        PriorityQueue<E>pq=new PriorityQueue<>((a,b)->a.v-b.v);
        for(int j=0;j<k;j++){
            int m=sc.nextInt();
            List<Integer>t=new ArrayList<>();
            for(int i=0;i<m;i++)t.add(sc.nextInt());
            lists.add(t);
            if(m>0)pq.offer(new E(t.get(0),j,0));
        }
        List<Integer>ans=new ArrayList<>();
        while(!pq.isEmpty()){
            E e=pq.poll();
            ans.add(e.v);
            if(e.i+1<lists.get(e.l).size())pq.offer(new E(lists.get(e.l).get(e.i+1),e.l,e.i+1));
        }
        System.out.println(ans);
    }
}