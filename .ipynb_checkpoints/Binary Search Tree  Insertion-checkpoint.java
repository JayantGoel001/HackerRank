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
    return root;
}