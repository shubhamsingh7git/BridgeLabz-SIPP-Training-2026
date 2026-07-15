public class Scenario1_CircularQueue{
static class PacketBuffer{
private int[] data;
private int front,count;
PacketBuffer(int capacity){data=new int[capacity];front=0;count=0;}
boolean enqueue(int packetId){
if(count==data.length)return false;
data[(front+count)%data.length]=packetId;
count++;
return true;
}
int dequeue(){
if(count==0)throw new RuntimeException("Buffer empty");
int val=data[front];
front=(front+1)%data.length;
count--;
return val;
}
}
public static void main(String[] args){
PacketBuffer q=new PacketBuffer(3);
q.enqueue(10);q.enqueue(20);q.enqueue(30);
System.out.println(q.dequeue());
q.enqueue(40);
System.out.println(q.dequeue());
}
}