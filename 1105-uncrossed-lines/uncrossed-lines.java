class Solution {
    public int maxUncrossedLines(int[] nums1, int[] nums2) {
        return UL2(nums1,nums2);
    }
        public static int UL2(int[] arr1, int[] arr2) {
        int[][] dp = new int[arr1.length+1][arr2.length+1];
        for (int i = 1; i < dp.length; i++) {
      
            for (int j = 1; j < dp[0].length; j++) {
  int ans = 0;

                if (arr1[i - 1] == arr2[j - 1]) {
                    ans = 1 + dp[i - 1][j - 1];
                } else {
                    int a = dp[i - 1][j];
                    int b = dp[i][j - 1];
                    ans = Math.max(a, b);
                }
                dp[i][j] = ans;
            }
        }
        return dp[dp.length - 1][dp[0].length - 1];
    }
}