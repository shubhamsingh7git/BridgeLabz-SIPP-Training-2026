import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario6_LCA_BST {

    static Node insert(Node node,int val){
        if(node==null) return new Node(val);
        if(val<node.val) node.left=insert(node.left,val);
        else if(val>node.val) node.right=insert(node.right,val);
        return node;
    }

    static Node lca(Node root,int p,int q){
        Node cur=root;
        while(cur!=null){
            if(p<cur.val&&q<cur.val)cur=cur.left;
            else if(p>cur.val&&q>cur.val)cur=cur.right;
            else return cur;
        }
        return null;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
        int p=sc.nextInt(),q=sc.nextInt();
        Node ans=lca(root,p,q);
        System.out.println(ans!=null?ans.val:"Not Found");
    }
}
