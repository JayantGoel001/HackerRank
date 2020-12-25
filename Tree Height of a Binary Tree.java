

    /*
    class Node 
        int data;
        Node left;
        Node right;
    */
    public static int height(Node root) 
    {
        if(root==null)
        {
            return -1;
        }

        int ldepth=height(root.left);
        int rdepth=height(root.right);
        if(ldepth>rdepth)
        {
            return (ldepth+1);
        }
        else
        {
            return (rdepth+1);
        }
    }

