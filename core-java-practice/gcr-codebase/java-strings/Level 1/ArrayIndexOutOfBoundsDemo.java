import java.util.Scanner;
public class ArrayIndexOutOfBoundsDemo {
    static void handle(String[] arr){
        try{
            System.out.println(arr[arr.length+1]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Handled ArrayIndexOutOfBoundsException");
        }catch(RuntimeException e){
            System.out.println("Handled RuntimeException");
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++) arr[i]=sc.next();
        handle(arr);
    }
}