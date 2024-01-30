class Solution {
    public void moveZeroes(int[] nums) {
        // If the array has only one element, no need to move anything
        if (nums.length == 1)
            return;

        // Use two pointers to move non-zero elements to the left
        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            // If the current element is non-zero, move it to the left
            if (nums[right] != 0) {
                nums[left] = nums[right];
                left++;
            }
        }

        // Fill the remaining positions with zeros
        for (int i = left; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}


//  brute force O(n) sc: O(n)
        // // If the array has only one element, no need to move anything
        // if (nums.length == 1)
        //     return;

        // // Use a Queue to store non-zero elements in the original order
        // Queue<Integer> queue = new LinkedList<>();
        // for (int i = 0; i < nums.length; i++) {
        //     if (nums[i] != 0)
        //         queue.add(nums[i]);
        // }

        // // Fill the array with the non-zero elements from the Queue
        // int index = 0;
        // while (queue.size() != 0) {
        //     nums[index] = queue.poll();
        //     index++;
        // }

        // // Fill the remaining positions with zeros
        // for (int i = index; i < nums.length; i++) {
        //     nums[i] = 0;
        // }
