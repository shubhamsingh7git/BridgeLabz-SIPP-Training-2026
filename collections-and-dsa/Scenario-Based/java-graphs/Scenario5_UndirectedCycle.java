import java.util.*;
public class Scenario5_UndirectedCycle{
    static boolean dfs(Map<Integer,List<Integer>> g,int x,int p,Set<Integer> v){
        v.add(x);
        for(int n:g.getOrDefault(x,new ArrayList<>())){
            if(!v.contains(n)&&dfs(g,n,x,v))return true;
            else if(n!=p)return true;
        }
        return false;
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
        boolean ans=false;
        for(int i=0;i<n;i++)if(!vis.contains(i)&&dfs(g,i,-1,vis))ans=true;
        System.out.println(ans);
    }
}
