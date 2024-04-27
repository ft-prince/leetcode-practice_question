/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the root is null, or if either p or q is found, return the root

        if (root == null)
            return null;
        if (root == p || root == q) {
            return root;
        }
        // Search for p and q in the left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // Search for p and q in the right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);

        // If both p and q are found in different subtrees, return the current root as
        // the LCA
        if (left != null && right != null) {
            return root;
        }

        // If either p or q is found in one of the subtrees, return that node
        // Otherwise, return the node found in the other subtree (may be null)
        return (left != null) ? left : right;
    }
}