/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
    
       int diff=getDifference( headA, headB);
           // Initialize pointers to the heads of both lists
        ListNode pointerA = headA;
        ListNode pointerB = headB;

        // Adjust the position of pointers based on the length difference
        if (diff < 0) {
            while (diff++ != 0) pointerB = pointerB.next;
        } else {
            while (diff-- != 0) pointerA = pointerA.next;
        }
        while(pointerA !=null){
            if (pointerA == pointerB) return pointerA; // Intersection found
          pointerA=pointerA.next;
          pointerB=pointerB.next;
        }

   return null;

    }
public int getDifference(ListNode head1, ListNode head2) {
    // Initialize length counters for both lists
    int len1 = 0, len2 = 0;
    
    // Traverse both lists simultaneously to calculate their lengths
    while (head1 != null || head2 != null) {
        // If head1 is not null, increment len1 and move head1 to the next node
        if (head1 != null) {
            ++len1;
            head1 = head1.next;
        }
        // If head2 is not null, increment len2 and move head2 to the next node
        if (head2 != null) {
            ++len2;
            head2 = head2.next;
        }
    }
    // Return the absolute difference in lengths between the two lists
    return len1 - len2;
   }
}