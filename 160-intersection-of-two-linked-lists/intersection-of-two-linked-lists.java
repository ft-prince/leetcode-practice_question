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
        // we can do with the size also cal the size from both the loops then sub find the val  starts point out from that val
        
 int a=length(headA);
 int b=length(headB);
 while(a>b){
     headA=headA.next;
     a--;
 }

 while(b>a){
     headB=headB.next;
     b--;
 }

 while(headA!=headB){
     headA=headA.next;   
       headB=headB.next;

 }
return headA;
    }

    private int length(ListNode node) {
    int length = 0;
    while (node != null) {
        node = node.next;
        length++;
    }
    return length;
}
}