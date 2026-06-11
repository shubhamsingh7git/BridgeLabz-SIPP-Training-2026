import java.util.Scanner;
public class StringIndexOutOfBoundsDemo {
    static void handle(String text){
        try{
            System.out.println(text.charAt(text.length()+1));
        }catch(StringIndexOutOfBoundsException e){
            System.out.println("Handled: "+e);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        handle(sc.next());
    }
}