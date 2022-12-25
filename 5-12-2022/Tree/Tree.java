class Node{
    int data;
    Node left;
    Node right;
    public Node(int data)
    {
        this.data=data;
        left=null;
        right=null;
    }
}

public class Tree{
    Node root = new Node(3);
    root.left= new Node(4);
    root.right =new Node(5);
    
}