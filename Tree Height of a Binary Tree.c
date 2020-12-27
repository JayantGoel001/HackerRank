

/* you only have to complete the function given below.  
node is defined as  

struct node {
    
    int data;
    struct node *left;
    struct node *right;
  
};

*/
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
    // Write your code here
}

