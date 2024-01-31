class Solution {
    // Method to check if it is possible to reach the last index of the array
    public boolean canJump(int[] nums) {
        // Variable to store the maximum reachable index
        int reachable = 0;

        // Iterate through the array
        for (int i = 0; i < nums.length && i <= reachable; i++) {
            // Update the maximum reachable index
            reachable = Math.max(reachable, i + nums[i]);

            // Check if the maximum reachable index is greater than or equal to the last index
            if (reachable >= nums.length - 1) {
                // If yes, it is possible to reach the last index
                return true;
            }
        }

        // If the loop completes without reaching the last index, return false
        return false;
    }
}





//  brute force we can use two nested loop which will check from each start