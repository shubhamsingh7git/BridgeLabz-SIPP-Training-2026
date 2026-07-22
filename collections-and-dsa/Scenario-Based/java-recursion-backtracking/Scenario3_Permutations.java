
import java.util.*;

public class Scenario3_Permutations {
    static void backtrack(String[] arr,boolean[] used,List<String> path,
                          List<List<String>> ans){
        if(path.size()==arr.length){
            ans.add(new ArrayList<>(path));
            return;
        }

        for(int i=0;i<arr.length;i++){
            if(!used[i]){
                used[i]=true;
                path.add(arr[i]);

                backtrack(arr,used,path,ans);

                path.remove(path.size()-1);
                used[i]=false;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];

        for(int i=0;i<n;i++) arr[i]=sc.next();

        List<List<String>> ans=new ArrayList<>();
        backtrack(arr,new boolean[n],new ArrayList<>(),ans);

        System.out.println(ans);
    }
}
