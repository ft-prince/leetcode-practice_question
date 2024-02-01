class Solution {
    public int firstMissingPositive(int[] nums) {
        
        
        // Step 1: Preprocess the array
        for (int i = 0; i < nums.length; i++) {
            // Convert non-positive integers to nums.length + 1
            if (nums[i] <= 0) {
                nums[i] = nums.length + 1;
            }
        }

        // Step 2: Marking indices
        for (int i = 0; i < nums.length; i++) {
            // Calculate the index based on the absolute value of the element
            int index = Math.abs(nums[i]) - 1;

            // If the index is within the valid range and the value is positive,
            // negate the value at the corresponding index
            if (index < nums.length && nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }

        // Step 3: Scan the array to find the first positive index
        for (int i = 0; i < nums.length; i++) {
            // Return the first positive index encountered
            if (nums[i] > 0) {
                return i + 1;
            }
        }

        // If no positive values are found, return nums.length + 1
        return nums.length + 1;
    }
}
