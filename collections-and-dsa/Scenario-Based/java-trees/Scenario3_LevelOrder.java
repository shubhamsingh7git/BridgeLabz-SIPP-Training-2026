import java.util.*;

class Node {
    int val;
    Node left, right;
    Node(int val){
        this.val=val;
    }
}


public class Scenario3_LevelOrder{
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n==0)return;
        Node root=new Node(sc.nextInt());
        for(int i=1;i<n;i++)insert(root,sc.nextInt());
        Queue<Node> q=new LinkedList<>();
        q.offer(root);
        while(!q.isEmpty()){
            int sz=q.size();
            for(int i=0;i<sz;i++){
                Node cur=q.poll();
                System.out.print(cur.val+" ");
                if(cur.left!=null)q.offer(cur.left);
                if(cur.right!=null)q.offer(cur.right);
            }
            System.out.println();
        }
    }
}

