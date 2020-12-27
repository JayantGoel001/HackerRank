
public static void levelOrder(Node root) 
{
 int h=height(root);
 for(int i=1;i<=h;i++)
 {
     printgivenlevel(root,i);
 } 
}
public static int height(Node root)
{
    if(root==null)
    {
        return 0;
    }
    int ldepth=height(root.left);
    int rdepth=height(root.right);
    if(ldepth>rdepth)
    {
        return ldepth+1;
    }
    else
    {
        return rdepth+1;
    }
}
public static void printgivenlevel(Node root,int level)
{
    if(root==null)
    {
        return ;
    }
    if(level==1)
    {
        System.out.print(root.data+" ");
    }
    else if(level>1)
    {
        printgivenlevel(root.left,level-1);
        printgivenlevel(root.right,level-1);
    }
}
