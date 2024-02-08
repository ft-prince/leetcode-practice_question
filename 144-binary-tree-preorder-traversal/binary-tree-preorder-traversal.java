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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> preorder = new ArrayList<>();
        
        // If the root is null, return an empty list
        if (root == null) return preorder;
        
        // Initialize a stack for preorder traversal
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        
        TreeNode curr;
        while (!stack.isEmpty()) {
            curr = stack.pop();
            preorder.add(curr.val); // Add current node's value to the result
            
            // Push the right child first so that it's processed after the left child
            if (curr.right != null) {
                stack.push(curr.right);
            }
            
            // Push the left child if it exists
            if (curr.left != null) {
                stack.push(curr.left);
            }
        }
        
        return preorder;
    }
}
