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
    public int minDepth(TreeNode root) {
        if (root == null) return 0;
        return dfs(root);   
    }
    
    public int dfs(TreeNode root) {
        if (root == null) return Integer.MAX_VALUE; // Return 0 if node is null
        if (root.left == null && root.right == null) return 1; // Return 1 if leaf node
        
        int left = dfs(root.left); // Recursively calculate min depth of left subtree
        int right = dfs(root.right); // Recursively calculate min depth of right subtree
        
        // Return the minimum depth of the subtree rooted at the current node
        return 1 + Math.min(left, right);
    }
}
