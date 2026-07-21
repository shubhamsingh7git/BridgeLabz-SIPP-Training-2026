import java.util.*;
public class Scenario1_ERTriage{
    static class Patient{
        String name;
        int severity;
        Patient(String n,int s){
            name=n;
            severity=s;
        }
    }
    public static void main(String[]a){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        PriorityQueue<Patient> pq=new PriorityQueue<>((x,y)->y.severity-x.severity);
        for(int i=0;i<n;i++)pq.offer(new Patient(sc.next(),sc.nextInt()));
        while(!pq.isEmpty()){
            Patient p=pq.poll();
            System.out.println(p.name+" "+p.severity);
        }
        sc.close();
    }
}