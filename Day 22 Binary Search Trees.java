public static int getHeight(Node root)
{
    if(root==null)
    {
        return -1;
    }
    Solution obj = new Solution();
    int ldepth = obj.getHeight(root.left);
    int rdepth = obj.getHeight(root.right);
    if(ldepth>rdepth)
    {
        return ldepth+1;
    }
    else
    {
        return rdepth+1;
    }
}