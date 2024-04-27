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
    public int diameterOfBinaryTree(TreeNode root) {
        return diameter(root).dia;
    }
    public diapair diameter( TreeNode root){
    
    if(root==null){
        return new diapair();
    }
       diapair ldp =diameter(root.left);
       diapair rdp =diameter(root.right);
       diapair sdp=new diapair();
         int ld=ldp.dia;
         int rd=rdp.dia;
         int sd=ldp.ht+rdp.ht;
         sdp.dia=Math.max(ld,Math.max(rd,sd));
         sdp.ht=Math.max(ldp.ht,rdp.ht)+1;
         return sdp;
    }
    private class diapair{
        int dia=0;
        int ht=0;
    }
}