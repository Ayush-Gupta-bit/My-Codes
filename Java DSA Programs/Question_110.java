import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    public Node(int data) {
        this.data=data;
        right=null;
        left=null;
    }
}
class Question_110 {
    public static Node constructBinaryTree(int arr[]) {
        Node root=new Node(arr[0]);
        int n=arr.length;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        int i=1;
        while(i<n-1) {
            Node temp=q.remove();
            Node left=new Node(10);
            Node right=new Node(100);
            if(arr[i]==-1) 
            left=null;
            else {
                left.data=arr[i];
                q.add(left);
            }
            if(arr[i+1]==-1)
            right=null;
            else {
                right.data=arr[i+1];
                q.add(right);
            }
            temp.left=left;
            temp.right=right;
            i+=2;
        }
        return root;
    }
    public static void inorder(Node root) {
        if(root==null) 
        return;
        if(root.left!=null) 
        inorder(root.left);
        System.out.print(root.data+" ");
        if(root.right!=null) 
        inorder(root.right);
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes in Binary Tree: ");
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0; i<n; i++) 
        a[i]=sc.nextInt();
        Node root=constructBinaryTree(a);
        inorder(root);
    }
}