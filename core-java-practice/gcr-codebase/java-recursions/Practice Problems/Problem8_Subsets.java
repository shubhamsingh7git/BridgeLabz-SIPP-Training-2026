public class Problem8_Subsets{
    static void subsets(int[] a,int i,String cur){
        if(i==a.length){ System.out.println("["+cur+"]"); return; }
        subsets(a,i+1,cur);
        subsets(a,i+1,cur.isEmpty()?String.valueOf(a[i]):cur+","+a[i]);
    }
    public static void main(String[] args){ int[] a={1,2}; subsets(a,0,""); }
}