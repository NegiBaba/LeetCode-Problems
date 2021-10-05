/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */
class Solution {
public:
    void inOrderLeft(string &a, TreeNode* root) {
        if (root == NULL) {
            a += 'N';
            return;
        }
        a += to_string(root->val);
        inOrderLeft(a, root->left);
        inOrderLeft(a, root->right);
    }
    
    void inOrderRight(string &b, TreeNode* root) {
        if (root == NULL) {
            b += 'N';
            return;
        }
        b += to_string(root->val);
        inOrderRight(b, root->right);
        inOrderRight(b, root->left);
    }
    bool isSymmetric(TreeNode* root) {
        string a, b;
        inOrderLeft(a, root->left);
        inOrderRight(b, root->right);
        
        return a == b;
    }
};