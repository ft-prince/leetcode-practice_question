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
        // Check if the head is null, if so, return null since there are no nodes to process
        if (head == null) return null;
        
        // Initialize a pointer 'curr' to traverse the list
        ListNode curr = head;
        // Create a stack to store unique nodes
        Stack<ListNode> stack = new Stack<>();
        
        // Iterate through the list
        while (curr != null) {
            // Check if the stack is empty
            if (stack.isEmpty()) {
                // If empty, push the current node onto the stack
                stack.push(curr);
            } else {
                // If not empty, compare the value of the current node with the value of the node at the top of the stack
                if (stack.peek().val != curr.val) {
                    // If they are different, push the current node onto the stack
                    stack.push(curr);
                }
            }
            // Move to the next node
            curr = curr.next;
        }
        
        // Initialize a new head pointer to store the reversed list
        ListNode newHead = null;
        // Iterate through the stack to reverse it
        while (!stack.isEmpty()) {
            // Pop a node from the stack
            ListNode tmp = stack.pop();
            // Make the next of the popped node point to the current newHead
            tmp.next = newHead;
            // Update the newHead to the popped node
            newHead = tmp;
        }
        
        // Return the head of the reversed list
        return newHead;
    }
}


// 2nd method is by using stack 