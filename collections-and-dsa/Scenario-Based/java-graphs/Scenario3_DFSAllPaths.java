import java.util.*;
public class Scenario3_DFSAllPaths{
    static void dfs(Map<Integer,List<Integer>> g,int c,int t,List<Integer> p,Set<Integer> v,List<List<Integer>> a){
        p.add(c);
        v.add(c);
        if(c==t)a.add(new ArrayList<>(p));
        else for(int n:g.getOrDefault(c,new ArrayList<>()))
            if(!v.contains(n))dfs(g,n,t,p,v,a);
        p.remove(p.size()-1);
        v.remove(c);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int e=sc.nextInt();
        Map<Integer,List<Integer>> g=new HashMap<>();
        while(e-->0){
            int u=sc.nextInt(),v=sc.nextInt();
            g.computeIfAbsent(u,k->new ArrayList<>()).add(v);
        }
        int s=sc.nextInt(),t=sc.nextInt();
        List<List<Integer>> a=new ArrayList<>();
        dfs(g,s,t,new ArrayList<>(),new HashSet<>(),a);
        System.out.println(a);
    }
}
