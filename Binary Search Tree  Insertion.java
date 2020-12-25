

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {
        Node node=new Node(data);
        if(root==null)
        {
            root=node;
            return root;
        }
        if(root.data>data)
        {
            root.left=insert(root.left,data);
        }
        else
        {
            root.right=insert(root.right,data);
        }
        //temp=new Node(data);
        //System.out.println
        //root=temp;
        return root;
    }

