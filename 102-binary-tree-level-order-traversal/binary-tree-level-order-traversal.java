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
    public List<List<Integer>> levelOrder(TreeNode root) {
        // List to store the level order traversal
        List<List<Integer>> traversal = new ArrayList<>();
        
        // If the root is null, return an empty list
        if (root == null) return traversal;
        
        // Initialize a queue for level order traversal
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        
        // Perform level order traversal
        while (!queue.isEmpty()) {
            int size = queue.size(); // Number of nodes at current level
            List<Integer> currLevel = new ArrayList<>(); // List to store current level's values
            
            // Traverse through all nodes at the current level
            while (size != 0) {
                TreeNode tmp = queue.poll(); // Dequeue node from the queue
                currLevel.add(tmp.val); // Add node's value to current level list
                
                // Enqueue left and right child nodes if they exist
                if (tmp.left != null) queue.add(tmp.left);
                if (tmp.right != null) queue.add(tmp.right);
                
                size--; // Decrement the number of nodes left at current level
            }
            
            // Add the current level list to the traversal list
            traversal.add(currLevel);
        }
        
        return traversal; // Return the level order traversal list
       }
}