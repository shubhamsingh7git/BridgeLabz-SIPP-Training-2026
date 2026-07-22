import java.util.*;
public class Scenario1_FriendGraph{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Map<Integer,Set<Integer>> graph=new HashMap<>();
        int e=sc.nextInt();
        while(e-->0){
            int u=sc.nextInt(),v=sc.nextInt();
            graph.computeIfAbsent(u,k->new HashSet<>()).add(v);
            graph.computeIfAbsent(v,k->new HashSet<>()).add(u);
        }
        int u=sc.nextInt(),v=sc.nextInt();
        System.out.println(graph.getOrDefault(u,Collections.emptySet()).contains(v));
    }
}
