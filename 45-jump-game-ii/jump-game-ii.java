class Solution {
    public int jump(int[] nums) {
        // Create a memoization array to store the results of subproblems
        int[] memo = new int[nums.length];
        // Initialize the memoization array with -1 to indicate uncomputed values
        for (int i = 0; i < memo.length; i++) {
            memo[i] = -1;
        }
        // Call the recursive function starting from the first index
        return solveRec(nums, 0, memo);
    }

    private int solveRec(int[] nums, int idx, int[] memo) {
        // If we have reached the last index, no more jumps are needed
        if (idx == nums.length - 1) return 0;

        // If the result for this index is already computed, return it
        if (memo[idx] != -1) return memo[idx];

        // Initialize the minimum jumps to a large value
        int min = Integer.MAX_VALUE;

        // Iterate over the range of possible jumps from the current index
        for (int i = idx + 1; i <= idx + nums[idx] && i < nums.length; i++) {
            // Recursively solve for the next index and add one jump
            int jumps = solveRec(nums, i, memo);
            // Update the minimum jumps
            if (jumps != Integer.MAX_VALUE) {
                min = Math.min(min, jumps + 1);
            }
        }

        // Store the result in the memoization array
        memo[idx] = min;

        return min;
    }
}
