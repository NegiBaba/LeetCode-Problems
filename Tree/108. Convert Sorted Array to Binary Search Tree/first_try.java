/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void insert(TreeNode root, TreeNode node) {
        if (root.val > node.val) {
            if (root.left == null) {
                root.left = node;
                return;
            } else {
                insert(root.left, node);
            }
        } else {
            if (root.right == null) {
                root.right = node;
                return;
            } else {
                insert(root.right, node);
            }
        }
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        int mid = nums.length / 2;
        
        TreeNode root = new TreeNode(nums[mid]);
        
        
        return root;
    }
}