class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        // Check if the linked list is empty or if rotation is not needed
        if (head == null || k == 0) return head;
        
        // Calculate the size of the linked list
        int size = 1; // Start from 1 because head is not null
        ListNode curr = head;
        while (curr.next != null) {
            size++;
            curr = curr.next;
        }
        
        // Adjust k to the range [0, size-1] to avoid unnecessary rotations
        k = k % size;
        if (k == 0) return head; // No rotation needed
        
        // Connect the last node to the head to form a circular linked list
        curr.next = head;
        
        // Find the new end of the linked list after rotation
        for (int i = 0; i < size - k; i++) {
            curr = curr.next;
        }
        
        // Update newHead and break the circular linked list
        ListNode newHead = curr.next;
        curr.next = null;
        
        return newHead; // Return the new head of the rotated linked list
    }
}
