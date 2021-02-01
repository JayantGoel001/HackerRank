#include <climits>
bool checkMinMax(Node *root,int mini,int maxi){
    if(root==nullptr){
        return true;
    }else{
        return mini<root->data && root->data<maxi && checkMinMax(root->left,mini, root->data) && checkMinMax(root->right,root->data, maxi);
    }
}
bool checkBST(Node* root) {
    return checkMinMax(root,INT_MIN,INT_MAX);
}