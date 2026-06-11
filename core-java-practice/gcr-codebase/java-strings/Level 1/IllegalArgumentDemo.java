import java.util.Scanner;
public class IllegalArgumentDemo {
    static void handle(String text){
        try{
            System.out.println(text.substring(5,2));
        }catch(IllegalArgumentException e){
            System.out.println("Handled IllegalArgumentException");
        }catch(RuntimeException e){
            System.out.println("Handled RuntimeException");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        handle(sc.next());
    }
}