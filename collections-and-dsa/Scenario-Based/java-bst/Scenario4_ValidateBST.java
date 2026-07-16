import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario4_ValidateBST {

    static Node insert(Node node,int val){
        if(node==null) return new Node(val);
        if(val<node.val) node.left=insert(node.left,val);
        else if(val>node.val) node.right=insert(node.right,val);
        return node;
    }

    static boolean validate(Node n,long min,long max){
        if(n==null)return true;
        if(n.val<=min||n.val>=max)return false;
        return validate(n.left,min,n.val)&&validate(n.right,n.val,max);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
        System.out.println(validate(root,Long.MIN_VALUE,Long.MAX_VALUE));
    }
}
