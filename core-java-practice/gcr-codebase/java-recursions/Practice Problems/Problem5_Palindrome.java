public class Problem5_Palindrome{
    static boolean pal(String s,int l,int r){ if(l>=r) return true; return s.charAt(l)==s.charAt(r)&&pal(s,l+1,r-1); }
    public static void main(String[] args){ System.out.println(pal("madam",0,4)?"Palindrome":"Not Palindrome"); }
}