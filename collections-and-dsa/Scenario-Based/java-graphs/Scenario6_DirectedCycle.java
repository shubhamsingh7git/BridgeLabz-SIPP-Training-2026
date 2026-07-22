import java.util.*;
public class Scenario6_DirectedCycle{
    static boolean dfs(Map<Integer,List<Integer>> g,int x,int[] s){
        s[x]=1;
        for(int n:g.getOrDefault(x,new ArrayList<>())){
            if(s[n]==1)return true;
            if(s[n]==0&&dfs(g,n,s))return true;
        }
        s[x]=2;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),e=sc.nextInt();
        Map<Integer,List<Integer>> g=new HashMap<>();
        while(e-->0)g.computeIfAbsent(sc.nextInt(),k->new ArrayList<>()).add(sc.nextInt());
        int[] state=new int[n];
        boolean ans=false;
        for(int i=0;i<n;i++)if(state[i]==0&&dfs(g,i,state))ans=true;
        System.out.println(ans);
    }
}
