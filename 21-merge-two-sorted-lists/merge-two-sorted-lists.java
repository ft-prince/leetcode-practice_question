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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a new node to act as the dummy head of the merged list
        ListNode newHead = new ListNode(-1);
        // Create pointers to traverse both input lists and another pointer to build the merged list
        ListNode p1 = list1, p2 = list2, curr = newHead;
        
        // Iterate over both lists until one of them becomes null
        while (p1 != null && p2 != null) {
            // Compare values of nodes from both lists and append the smaller one to the merged list
            if (p1.val < p2.val) {
                curr.next = p1;
                curr = curr.next;
                p1 = p1.next;
            } else {
                curr.next = p2;
                curr = curr.next;
                p2 = p2.next;
            }
        }
        
        // Append the remaining nodes of list1 or list2 to the merged list if any
        if (p1 != null) curr.next = p1;
        if (p2 != null) curr.next = p2;
        
        // Return the head of the merged list (skipping the dummy head)
        return newHead.next;
    }
}
