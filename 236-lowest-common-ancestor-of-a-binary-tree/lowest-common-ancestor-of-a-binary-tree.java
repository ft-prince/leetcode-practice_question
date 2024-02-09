/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the root is null, return null
        if(root == null){
            return null;
        }   
        // If the root is either p or q, return the root
        if(root == p || root == q){
            return root;
        }
        // Recursively find the lowest common ancestor in the left subtree
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        // Recursively find the lowest common ancestor in the right subtree
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        // If both left and right subtrees return non-null values, then the current root is the lowest common ancestor
        if(left != null && right != null){
            return root;
        }
        // If left is null, it means both nodes are in the right subtree, so return right
        if(left == null){
            return right;
        }
        // If right is null, it means both nodes are in the left subtree, so return left
        else{
            return left;
        }
    }
}
