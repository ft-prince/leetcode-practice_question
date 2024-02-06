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
    public ListNode middleNode(ListNode head) {
        // If there is only one node in the list, return it as the middle node
        if (head.next == null)
            return head;

        // Initialize two pointers: slow and fast, both pointing to the head of the list
        ListNode slow = head, fast = head;
        
        // Loop until either fast or its next node becomes null, indicating the end of the list
        while (fast != null && fast.next != null) {
            // Move slow pointer one step forward
            slow = slow.next;
            // Move fast pointer two steps forward
            fast = fast.next.next;
        }
        
        // At this point, slow is pointing to the middle node of the list
        return slow;    }
}