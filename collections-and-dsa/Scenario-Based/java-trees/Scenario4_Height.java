import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario4_Height{
    static void insert(Node r,int v){
        if(v<r.val){
            if(r.left==null)r.left=new Node(v);
            else insert(r.left,v);
        }
        else{
            if(r.right==null)r.right=new Node(v);
            else insert(r.right,v);
        }
    }
    static int h(Node n){
        if(n==null)return -1;
        return Math.max(h(n.left),h(n.right))+1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)return;
        Node root=new Node(sc.nextInt());
        for(int i=1;i<n;i++)insert(root,sc.nextInt());
        int t=sc.nextInt();
        int ht=h(root);
        System.out.println(ht);
        System.out.println(ht>t);
    }
}

