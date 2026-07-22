
import java.util.*;

public class Scenario5_WordSearch {
    static boolean dfs(char[][] grid,String word,int idx,int r,int c,
                       boolean[][] vis){

        if(idx==word.length()) return true;

        if(r<0 || c<0 || r>=grid.length || c>=grid[0].length)
            return false;

        if(vis[r][c] || grid[r][c]!=word.charAt(idx))
            return false;

        vis[r][c]=true;

        boolean found =
            dfs(grid,word,idx+1,r+1,c,vis) ||
            dfs(grid,word,idx+1,r-1,c,vis) ||
            dfs(grid,word,idx+1,r,c+1,vis) ||
            dfs(grid,word,idx+1,r,c-1,vis);

        vis[r][c]=false;

        return found;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        int r=sc.nextInt();
        int c=sc.nextInt();

        char[][] grid=new char[r][c];

        for(int i=0;i<r;i++){
            String s=sc.next();
            for(int j=0;j<c;j++)
                grid[i][j]=s.charAt(j);
        }

        String word=sc.next();

        boolean ans=false;
        boolean[][] vis=new boolean[r][c];

        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(dfs(grid,word,0,i,j,vis))
                    ans=true;
            }
        }

        System.out.println(ans);
    }
}
