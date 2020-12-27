bool isBST(Node *root,int min,int max)
{
    if(root==NULL){return true;}
    if(root->data>max || root->data<min)
    {
        return false;
    }
    return isBST(root->left,min,root->data-1)&& isBST(root->right,root->data+1,max);
}
bool checkBST(Node* root) {
    return isBST(root,-1,10000+1);
}