
import java.util.*;

public class Scenario1_Subsets {
    static void backtrack(String[] flags,int index,List<String> path,List<List<String>> ans){
        if(index==flags.length){
            ans.add(new ArrayList<>(path));
            return;
        }
        path.add(flags[index]);
        backtrack(flags,index+1,path,ans);
        path.remove(path.size()-1);
        backtrack(flags,index+1,path,ans);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] flags=new String[n];
        for(int i=0;i<n;i++) flags[i]=sc.next();

        List<List<String>> ans=new ArrayList<>();
        backtrack(flags,0,new ArrayList<>(),ans);
        System.out.println(ans);
    }
}
