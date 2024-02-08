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
    public List<Integer> postorderTraversal(TreeNode root) {
            List<Integer> postorder = new ArrayList<>();
        
        // If the root is null, return an empty list
        if (root == null) return postorder;
        
        // Initialize a stack for inorder traversal
        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode curr = root;
        //  Ro, R ,L
        while ( !stack.isEmpty()) {
          curr=stack.pop();

          while(curr!=null){
              postorder.add(curr.val);
              if(curr.left!=null)
              stack.push(curr.left);
                curr=curr.right;
                
          }
        }    
        //   L , R , Ro
    Collections.reverse(postorder);
    return postorder;
    }
}