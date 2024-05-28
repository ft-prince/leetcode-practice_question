class Solution {
    // Main method to find the length of the Longest Increasing Subsequence (LIS)
    public int lengthOfLIS(int[] nums) {
        return lis(nums);
    }

    // Helper method to calculate the LIS using dynamic programming and binary search
    public int lis(int[] arr) {
        // Array to store the end elements of potential increasing subsequences
        int[] ans = new int[arr.length];
        // Initialize the first element of ans with the first element of arr
        ans[0] = arr[0];
        // Variable to track the length of the longest increasing subsequence
        int len = 1;

        // Iterate over the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > ans[len - 1]) {
                // If the current element is greater than the last element in ans,
                // it extends the longest subsequence found so far
                ans[len] = arr[i];
                len++;
            } else {
                // Otherwise, find the position to replace in ans using binary search
                int idx = binarySearch(ans, 0, len - 1, arr[i]);
                ans[idx] = arr[i];
            }
        }
        // Return the length of the longest increasing subsequence
        return len;
    }

    // Helper method to perform binary search to find the insertion position
    private static int binarySearch(int[] ans, int lo, int hi, int item) {
        int idx = 0;
        while (lo <= hi) {
            int mid = (lo + hi) / 2;
            if (ans[mid] >= item) {
                idx = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }
        return idx;
    }
    
    // Old method using dynamic programming (commented out)
    // public static int lis(int[] arr) {
    // 	int[] dp = new int[arr.length];
    // 	Arrays.fill(dp, 1);
    // 	for (int i = 1; i < dp.length; i++) {
    // 		for (int j = 0; j < i; j++) {
    // 			if (arr[j] < arr[i]) {
    // 				dp[i] = Math.max(dp[i], dp[j] + 1);
    // 			}
    // 		}
    // 	}
    //     int ans = 1;
    //     for (int i = 0; i < dp.length; i++) {
    //         if (dp[i] > ans) {
    //             ans = dp[i];
    //         }
    //     }
    //     return ans;
    // }
}
