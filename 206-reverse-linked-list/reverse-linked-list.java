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
    public ListNode reverseList(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null)
            return head;
        
        // Initialize pointers to traverse the list
        ListNode curr = head;
        ListNode prev = null;
        
        // Iterate through the list, reversing pointers along the way
        while (curr != null) {
            // Store the next node temporarily
            ListNode tmp = curr.next;
            // Reverse the current node's pointer to point to the previous node
            curr.next = prev;
            // Move the pointers forward
            prev = curr;
            curr = tmp;
        }
        
        // At the end, prev will be pointing to the new head of the reversed list
        return prev;
    }
}

//  1st way naive approach by using stack 
//  iterative approach by using three pointer we can change the direction of nodes 

