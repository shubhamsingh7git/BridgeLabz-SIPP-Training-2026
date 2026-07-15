import java.util.*;
public class Scenario3_PriorityQueueER{
static class Patient{
int priority;String name;
Patient(int p,String n){priority=p;name=n;}
}
PriorityQueue<Patient> q=new PriorityQueue<>((a,b)->a.priority-b.priority);
void admitPatient(Patient p){q.offer(p);}
Patient callNextPatient(){return q.poll();}
public static void main(String[] args){
Scenario3_PriorityQueueER er=new Scenario3_PriorityQueueER();
er.admitPatient(new Patient(3,"Alice"));
er.admitPatient(new Patient(1,"Bob"));
er.admitPatient(new Patient(2,"Charlie"));
System.out.println(er.callNextPatient().name);
}
}