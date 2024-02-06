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
    public ListNode deleteDuplicates(ListNode head) {
        // Initialize a temporary pointer to traverse the list
        ListNode temp = head;
        
        // Iterate over the list until the temporary pointer reaches the end
        while (temp != null) {
            // Check if the current node and its next node have the same value
            if (temp.next != null && temp.next.val == temp.val) {
                // If duplicate, skip the next node by pointing the current node to the node after the next
                temp.next = temp.next.next;
            } else {
                // Move to the next node
                temp = temp.next;
            }
        }
        
        // Return the head of the modified list
        return head;
    }
}


// 2nd method is by using stack 