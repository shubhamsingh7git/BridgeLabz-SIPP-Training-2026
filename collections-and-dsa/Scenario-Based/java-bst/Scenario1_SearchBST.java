import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario1_SearchBST {

    static Node insert(Node node,int val){
        if(node==null) return new Node(val);
        if(val<node.val) node.left=insert(node.left,val);
        else if(val>node.val) node.right=insert(node.right,val);
        return node;
    }

    static boolean search(Node root,int target){
        Node cur=root;
        while(cur!=null){
            if(cur.val==target) return true;
            cur=(target<cur.val)?cur.left:cur.right;
        }
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
        int target=sc.nextInt();
        System.out.println(search(root,target));
    }
}
