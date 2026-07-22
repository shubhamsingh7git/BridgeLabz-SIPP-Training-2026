import java.util.*;
public class Scenario2_BFSShortestPath{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        Map<Integer,List<Integer>> g=new HashMap<>();
        while(e-->0){
            int u=sc.nextInt(),v=sc.nextInt();
            g.computeIfAbsent(u,k->new ArrayList<>()).add(v);
            g.computeIfAbsent(v,k->new ArrayList<>()).add(u);
        }
        int s=sc.nextInt(),d=sc.nextInt();
        Queue<Integer> q=new LinkedList<>();
        Map<Integer,Integer> p=new HashMap<>();
        Set<Integer> vis=new HashSet<>();
        q.offer(s);
        vis.add(s);
        p.put(s,-1);
        while(!q.isEmpty()){
            int x=q.poll();
            for(int n:g.getOrDefault(x,new ArrayList<>())){
                if(!vis.contains(n)){
                    vis.add(n);
                    p.put(n,x);
                    q.offer(n);
                }
            }
        }
        LinkedList<Integer> ans=new LinkedList<>();
        if(vis.contains(d)){
            while(d!=-1){
                ans.addFirst(d);
                d=p.get(d);
            }
        }
        System.out.println(ans);
    }
}
