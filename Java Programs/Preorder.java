import java.util.*;
class Preorder
{
    public static class Node
    {
        int data;
        Node left;
        Node right;
        public Node(int data)
        {
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    public Node root;
    public Preorder()
    {
        root=null;
    }
    public void insert(int data)
    {
        Node newNode=new Node(data);
        if(root==null)
        {
            root=newNode;
            return;
        }
        else{
            Node current=root,parent=null;
            while(true)
            {
                parent=current;
                if(data<current.data)
                {
                    current=current.left;
                    if(current==null)
                    {
                        parent.left=newNode;
                        return;
                    }
                }
                else{
                    current=current.right;
                    if(current==null)
                    {
                        parent.right=newNode;
                        return;
                    }
                }
            }
        }
    }
    public void preorderTraversal(Node node)
    {
        System.out.println(node.data);
        if(node.left!=null)
        preorderTraversal(node.left);
        //System.out.println(node.data);
        if(node.right!=null)
        preorderTraversal(node.right);

    }
    public static void main(String args[])
    {
        Preorder bt=new Preorder();
        Scanner sc=new Scanner(System.in);
        System.out.println("how many nodes");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++)
        {
            System.out.println("enter node"+i);
            int item=sc.nextInt();
            bt.insert(item);
        }
        System.out.println("After");
        bt.preorderTraversal(bt.root);
    }
}
