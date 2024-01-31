class Solution {
    public void rotate(int[] nums, int k) {
        // Calculate the effective rotation, in case k is larger than the array length
        k = k % nums.length;

        // Step 1: Reverse the entire array
        reverse(nums, 0, nums.length - 1);

        // Step 2: Reverse the first k elements
        reverse(nums, 0, k - 1);

        // Step 3: Reverse the remaining elements
        reverse(nums, k, nums.length - 1);
    }

    // Helper method to reverse the elements of the array in the specified range
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            // Swap the elements at start and end indices
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            // Move indices towards each other
            start++;
            end--;
        }
    }
}
