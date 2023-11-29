class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
              int[][] dp = new int[nums1.length][nums2.length];

       for (int ans[] :
                dp) {
            Arrays.fill(ans, -1);
        }

        return UL(nums1,nums2,0,0,dp);   
    }
      public static int UL(int[] arr1, int[] arr2, int i, int j, int dp[][]) {
        if (i == arr1.length || j == arr2.length) {
            return 0;
        }
        if (dp[i][j] != -1) {
            return dp[i][j];
        }
        int ans = 0;
        if (arr1[i] == arr2[j]) {
            ans = 1 + UL(arr1, arr2, i + 1, j + 1, dp);
        } else {
            int a = UL(arr1, arr2, i + 1, j, dp);
            int b = UL(arr1, arr2, i, j + 1, dp);
            ans = Math.max(a, b);
        }
        return dp[i][j] = ans;
    }
}