public class Problem9_TowerOfHanoi{
    static void hanoi(int n,char A,char B,char C){
        if(n==1){ System.out.println("Move disk 1 from "+A+" to "+C); return; }
        hanoi(n-1,A,C,B);
        System.out.println("Move disk "+n+" from "+A+" to "+C);
        hanoi(n-1,B,A,C);
    }
    public static void main(String[] args){ hanoi(3,'A','B','C'); }
}