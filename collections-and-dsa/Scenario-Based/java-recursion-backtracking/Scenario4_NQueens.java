
import java.util.*;

public class Scenario4_NQueens {
    static void solve(int n,int row,int[] col,List<List<String>> ans){
        if(row==n){
            ans.add(build(n,col));
            return;
        }

        for(int c=0;c<n;c++){
            if(safe(row,c,col)){
                col[row]=c;
                solve(n,row+1,col,ans);
            }
        }
    }

    static boolean safe(int row,int c,int[] col){
        for(int r=0;r<row;r++){
            if(col[r]==c) return false;
            if(Math.abs(col[r]-c)==Math.abs(r-row)) return false;
        }
        return true;
    }

    static List<String> build(int n,int[] col){
        List<String> board=new ArrayList<>();
        for(int i=0;i<n;i++){
            char[] row=new char[n];
            Arrays.fill(row,'.');
            row[col[i]]='Q';
            board.add(new String(row));
        }
        return board;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        List<List<String>> ans=new ArrayList<>();
        solve(n,0,new int[n],ans);

        System.out.println(ans);
    }
}
