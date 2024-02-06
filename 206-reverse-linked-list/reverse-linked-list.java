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
        ListNode newHead = null;

    public ListNode reverseList(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null)
            return head;
        
        // Initialize a newHead variable to store the new head of the reversed list
        // Call the reverse method to reverse the list recursively
        reverse(head);
        // Return the new head of the reversed list
        return newHead;
    }
    
    private ListNode reverse(ListNode head) {
        // Base case: If the current node is the last node, set it as the new head
        if (head.next == null) {
            newHead = head;
            return head;
        }
        // Recursively reverse the rest of the list
        ListNode tmp = reverse(head.next);
        // Reverse the pointers to reverse the list
        tmp.next = head;
        head.next = null;
        // Return the current node to the previous level of recursion
        return head;
    }
}

//  1st way naive approach by using stack 
//  iterative approach by using three pointer we can change the direction of nodes 
//  recursive function 
