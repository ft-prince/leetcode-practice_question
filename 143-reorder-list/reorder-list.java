class Solution {
    public void reorderList(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null)
            return;

        // Find the midpoint of the list using slow and fast pointers
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split the list into two halves
        ListNode head2 = slow.next;
        slow.next = null; // Disconnect the first half from the second half

        // Reverse the second half of the list
        head2 = reverse(head2);

        // Merge the two halves
        ListNode curr = new ListNode(-1); // Dummy node to build the merged list
        ListNode head1 = head;
        while (head1 != null) {
            ListNode tmp = head1.next; // Store the next node of head1
            curr.next = head1; // Link the current node to head1
            head1.next = head2; // Link the current node to head2
            curr = curr.next.next; // Move the current pointer forward
            head1 = tmp; // Move head1 forward
            if (head2 != null)
                head2 = head2.next; // Move head2 forward if it's not null
        }
    }

    // Method to reverse a linked list
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode tmp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tmp;
        }
        return prev; // Return the new head of the reversed list
    }
}
