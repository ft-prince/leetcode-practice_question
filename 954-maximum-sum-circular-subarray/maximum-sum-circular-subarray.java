class Solution {
    public int maxSubarraySumCircular(int[] A) {
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE, curr1 = 0, curr2 = 0, total = 0;
        for (int i = 0; i < A.length; i++) {
            // for finding the maximum
            curr1 = Math.max(A[i], A[i] + curr1);
            // Update the maximum sum by choosing the maximum between the current maximum
            // and the updated current sum
            max = Math.max(max, curr1);

            // for finding the minimum
            curr2 = Math.min(A[i], A[i] + curr2);
            // Update the minimum sum by choosing the minimum between the current minimum
            // and the updated current sum
            min = Math.min(min, curr2);

            total += A[i];
        }

        return max < 0 ? max : Math.max(max, total - min);
    }
}
