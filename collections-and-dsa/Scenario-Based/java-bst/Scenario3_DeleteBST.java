import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario3_DeleteBST {

    static Node insert(Node node,int val){
        if(node==null) return new Node(val);
        if(val<node.val) node.left=insert(node.left,val);
        else if(val>node.val) node.right=insert(node.right,val);
        return node;
    }

    static Node delete(Node node,int key){
        if(node==null)return null;
        if(key<node.val) node.left=delete(node.left,key);
        else if(key>node.val) node.right=delete(node.right,key);
        else{
            if(node.left==null) return node.right;
            if(node.right==null) return node.left;
            Node s=node.right;
            while(s.left!=null) s=s.left;
            node.val=s.val;
            node.right=delete(node.right,s.val);
        }
        return node;
    }
    static void inorder(Node r){
        if(r==null)return;
        inorder(r.left);
        System.out.print(r.val+" ");
        inorder(r.right);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
        root=delete(root,sc.nextInt());
        inorder(root);
    }
}
