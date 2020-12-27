public static void inOrder(Node root)
{
    if(root!=null)
    {
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

}