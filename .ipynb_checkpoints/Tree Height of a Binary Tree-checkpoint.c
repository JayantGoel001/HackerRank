int getHeight(struct node* root)
 {
     if(root==NULL)
     {
         return -1;
     }
     int lh=getHeight(root->left);
     int rh=getHeight(root->right);
     if (lh > rh) {
       return lh + 1;
     } 
     else
     {
         return rh+1;
     }
}

