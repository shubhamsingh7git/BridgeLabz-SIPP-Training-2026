import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario2_IterativePreorder{
    static void insert(Node r,int v){
        if(v<r.val){if(r.left==null)r.left=new Node(v);else insert(r.left,v);}
        else{if(r.right==null)r.right=new Node(v);else insert(r.right,v);}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)return;
        Node root=new Node(sc.nextInt());
        for(int i=1;i<n;i++)insert(root,sc.nextInt());
        List<Integer> ans=new ArrayList<>();
        Deque<Node> st=new ArrayDeque<>();
        st.push(root);
        while(!st.isEmpty()){
            Node cur=st.pop();
            ans.add(cur.val);
            if(cur.right!=null)st.push(cur.right);
            if(cur.left!=null)st.push(cur.left);
        }
        System.out.println(ans);
    }
}

