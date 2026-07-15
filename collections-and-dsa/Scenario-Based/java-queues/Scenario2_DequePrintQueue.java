import java.util.*;
public class Scenario2_DequePrintQueue{
Deque<Integer> printQueue=new ArrayDeque<>();
void submitJob(int id){printQueue.addLast(id);}
void submitUrgentJob(int id){printQueue.addFirst(id);}
int printNextJob(){return printQueue.removeFirst();}
public static void main(String[] args){
Scenario2_DequePrintQueue p=new Scenario2_DequePrintQueue();
p.submitJob(101);
p.submitJob(102);
p.submitUrgentJob(999);
System.out.println(p.printNextJob());
System.out.println(p.printNextJob());
}
}