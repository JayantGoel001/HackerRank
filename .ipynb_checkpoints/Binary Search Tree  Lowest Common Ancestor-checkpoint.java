public static Node lca(Node root, int v1, int v2) {
    if(v1>v2)
    {
        int temp=v1;
        v1=v2;
        v2=temp;
    }
    if(root.data>=v1 && root.data<=v2)
    {
        return root;
    }
    else if(root.data<v1 && root.data<v2)
    {
        return lca(root.right,v1,v2);
    }
    else
    {
        return lca(root.left,v1,v2);
    }
}