public class Problem4_ReverseString{
    static String rev(String s){ return s.isEmpty()?s:rev(s.substring(1))+s.charAt(0); }
    public static void main(String[] args){ System.out.println(rev("hello")); }
}