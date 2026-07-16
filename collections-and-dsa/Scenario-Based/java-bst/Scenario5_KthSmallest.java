import java.util.*;

class Node{
    int val;
    Node left,right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario5_KthSmallest {

    static Node insert(Node node,int val){
        if(node==null) return new Node(val);
        if(val<node.val) node.left=insert(node.left,val);
        else if(val>node.val) node.right=insert(node.right,val);
        return node;
    }

    static int kth(Node root,int k){
        Deque<Node> st=new ArrayDeque<>();
        Node cur=root;
        int c=0;
        while(cur!=null||!st.isEmpty()){
            while(cur!=null){
                st.push(cur);
                cur=cur.left;
            }
            cur=st.pop();
            c++;
            if(c==k)return cur.val;
            cur=cur.right;
        }
        return -1;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Node root=null;
        for(int i=0;i<n;i++) root=insert(root,sc.nextInt());
        int k=sc.nextInt();
        System.out.println(kth(root,k));
    }
}
