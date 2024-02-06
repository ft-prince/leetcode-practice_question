class Solution {
    public boolean isPalindrome(ListNode head) {
        // Check if the list is empty or has only one node
        if (head == null || head.next == null)
            return true;
        // Check if the list has exactly two nodes
        if (head.next.next == null)
            return head.val == head.next.val;

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

        // Compare each corresponding node of the first and second halves
        ListNode head1 = head;
        while (head2 != null) {
            if (head1.val != head2.val) {
                return false; // If values are different, not a palindrome
            }
            head1 = head1.next;
            head2 = head2.next;
        }
        return true; // All corresponding nodes have matching values, so it's a palindrome
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
