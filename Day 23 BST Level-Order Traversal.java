

	static void levelOrder(Node root){
      //Write your code here
      int h=height(root);
      for(int i=1;i<=h;i++)
      {
          printgivenlevel(root,i);
      }
    }
    public static void printgivenlevel(Node root,int i)
    {
        if(root==null)
        {
            return ;
        }
        Solution obj=new Solution();
        if(i==1)
        {
            System.out.print(root.data+" ");
        }
        else if(i>1)
        {
            obj.printgivenlevel(root.left,i-1);
            obj.printgivenlevel(root.right,i-1);
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

