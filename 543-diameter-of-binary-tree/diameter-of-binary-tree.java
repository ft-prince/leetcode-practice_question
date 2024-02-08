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

    int diameter = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        dfs(root); // Start DFS traversal from the root node
        return diameter; // Return the calculated diameter
    }

    private int dfs(TreeNode current) {
        if (current == null) {
            return 0; // Base case: Return 0 if the current node is null (leaf node)
        }
        // Recursively compute the depth of the left subtree
        int left = dfs(current.left);
        // Recursively compute the depth of the right subtree
        int right = dfs(current.right);
        // Update the diameter if the sum of left and right depths is greater
        diameter = Math.max(diameter, left + right);
        // Return the depth of the current subtree rooted at the current node
        return 1 + Math.max(left, right);
    }
}
