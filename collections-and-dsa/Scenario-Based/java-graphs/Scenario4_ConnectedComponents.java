import java.util.*;
public class Scenario4_ConnectedComponents{
    static void dfs(Map<Integer,List<Integer>> g,int x,Set<Integer> v){
        v.add(x);
        for(int n:g.getOrDefault(x,new ArrayList<>()))
            if(!v.contains(n))dfs(g,n,v);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),e=sc.nextInt();
        Map<Integer,List<Integer>> g=new HashMap<>();
        while(e-->0){
            int u=sc.nextInt(),v=sc.nextInt();
            g.computeIfAbsent(u,k->new ArrayList<>()).add(v);
            g.computeIfAbsent(v,k->new ArrayList<>()).add(u);
        }
        Set<Integer> vis=new HashSet<>();
        int c=0;
        for(int i=0;i<n;i++)if(!vis.contains(i)){c++;dfs(g,i,vis);}
        System.out.println(c);
        System.out.println(c==1);
    }
}
