class Solution {
    public int search(int[] nums, int target) {
        // Initialize pointers for binary search
        int left = 0;
        int right = nums.length - 1;

        // Binary search loop
        while (left <= right) {
            // Calculate mid index
            int mid = left + (right - left) / 2;

            // Check if target is found at mid
            if (nums[mid] == target)
                return mid;

            // Check if left to mid is sorted
            if (nums[left] <= nums[mid]) {
                // If target is in the left sorted range, adjust right pointer
                if (nums[left] <= target && target < nums[mid])
                    right = mid - 1;
                // If target is in the right unsorted range, adjust left pointer
                else
                    left = mid + 1;
            } else {
                // If mid to right is sorted
                // If target is in the right sorted range, adjust left pointer
                if (nums[mid] < target && target <= nums[right])
                    left = mid + 1;
                // If target is in the left unsorted range, adjust right pointer
                else
                    right = mid - 1;
            }
        }

        // Target not found
        return -1;
    }
}
