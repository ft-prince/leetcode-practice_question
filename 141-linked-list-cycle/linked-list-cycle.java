/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        return checkCycle(head);
    }
    public boolean checkCycle(ListNode head){
    ListNode slow=head;
    ListNode fast=head;
        while (fast != null && fast.next != null && slow != null) {
          fast = fast.next.next;  
            // Move slow one step.
            slow = slow.next;        
            
            if(slow==fast){
                return true;
            }
       }
       return false;
    }
}