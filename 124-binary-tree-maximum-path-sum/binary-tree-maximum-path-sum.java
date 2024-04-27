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
    // Method to find the maximum path sum in a binary tree
    public int maxPathSum(TreeNode root) {
        // Call the helper method to compute the maximum path sum
        maxPathSumHelper(root);
        // Return the maximum path sum found
        return ans;
    }
    
    // Global variable to store the maximum path sum
    int ans = Integer.MIN_VALUE;
    
    // Helper method to compute the maximum path sum starting from the current node
    public int maxPathSumHelper(TreeNode root) {
        // Base case: if the current node is null, return 0
        if (root == null) return 0;
        
        // Recursively find the maximum path sum for the left subtree
        int left = maxPathSumHelper(root.left);
        
        // Recursively find the maximum path sum for the right subtree
        int right = maxPathSumHelper(root.right);
        
        // Calculate the straight path (either the current node itself or the current node plus one subtree)
        int straightPath = Math.max(root.val, Math.max(left + root.val, right + root.val));
        
        // Calculate the curved path (the current node plus both subtrees)
        int curvedPath = left + right + root.val;
        
        // Update the global maximum path sum if necessary
        ans = Math.max(ans, Math.max(curvedPath, straightPath));
        
        // Return the maximum straight path sum for the parent node
        return straightPath;
    }
}
