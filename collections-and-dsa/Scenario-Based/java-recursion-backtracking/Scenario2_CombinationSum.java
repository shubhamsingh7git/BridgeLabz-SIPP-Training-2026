
import java.util.*;

public class Scenario2_CombinationSum {
    static void backtrack(int[] coins,int target,int start,int sum,
                          List<Integer> path,List<List<Integer>> ans){
        if(sum==target){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=start;i<coins.length;i++){
            if(sum+coins[i]>target) break;
            path.add(coins[i]);
            backtrack(coins,target,i,sum+coins[i],path,ans);
            path.remove(path.size()-1);
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] coins=new int[n];
        for(int i=0;i<n;i++) coins[i]=sc.nextInt();
        int target=sc.nextInt();

        Arrays.sort(coins);
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(coins,target,0,0,new ArrayList<>(),ans);

        System.out.println(ans);
    }
}
