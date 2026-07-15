import java.util.*;
class InvalidAgeException extends Exception{
    InvalidAgeException(String msg){super(msg);}
}
public class Problem3_CustomException{
    static void validateAge(int age)throws InvalidAgeException{
        if(age<18) throw new InvalidAgeException("Age must be 18 or above");
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        try{
            validateAge(sc.nextInt());
            System.out.println("Access granted!");
        }catch(InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}