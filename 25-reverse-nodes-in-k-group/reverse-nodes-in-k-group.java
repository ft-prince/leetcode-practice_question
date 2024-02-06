/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        // Check if there are at least k nodes left in the list
        ListNode node = head;
        int count = 0;
        while (count < k) { 
            // If there are fewer than k nodes left, return head (no need to reverse)
            if (node == null)
                return head;
            // Move to the next node
            node = node.next;
            // Increment count
            count++;
        }
        // Reverse the next k nodes and get the new head of this group
        ListNode pre = reverseKGroup(node, k); // pre node points to the answer of the sub-problem 
        while (count > 0) {  
            // Reverse the pointers of the current group of k nodes
            ListNode next = head.next; 
            head.next = pre; 
            pre = head; 
            head = next;
            // Decrement count
            count = count - 1;
        }
        // Return the new head of the reversed group
        return pre;
    }
}
