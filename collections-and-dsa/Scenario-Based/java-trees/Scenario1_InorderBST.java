import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario1_InorderBST{
    static void insert(Node r,int v){
        if(v<r.val){if(r.left==null)r.left=new Node(v);else insert(r.left,v);}
        else{if(r.right==null)r.right=new Node(v);else insert(r.right,v);}
    }
    static void inorder(Node n,List<Integer> ans){
        if(n==null)return;
        inorder(n.left,ans);
        ans.add(n.val);
        inorder(n.right,ans);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)return;
        Node root=new Node(sc.nextInt());
        for(int i=1;i<n;i++)insert(root,sc.nextInt());
        List<Integer> ans=new ArrayList<>();
        inorder(root,ans);
        System.out.println(ans);
    }
}

