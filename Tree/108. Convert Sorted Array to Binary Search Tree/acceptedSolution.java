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
    public TreeNode create(int[] nums, int l, int h) {
        if (l > h) {
            return null;
        }
        int mid = l + (h - l) / 2;
        
        TreeNode node = new TreeNode(nums[mid]);
        node.left = create(nums, l, mid - 1);
        node.right = create(nums, mid + 1, h);
        return node;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        
        TreeNode root = create(nums, 0, nums.length - 1);
        return root;
    }
}