/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
      //Store the next node value into given node
node.val=node.next.val;
      //Store the next to next node  into given node
node.next=node.next.next;

    }
}