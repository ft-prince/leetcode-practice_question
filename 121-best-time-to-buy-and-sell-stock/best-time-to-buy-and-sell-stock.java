class Solution {
    public int maxProfit(int[] prices) {
        // Check if there is only one or no element in the array
        if (prices.length <= 1) return 0;

        // Initialize the profit and left pointer
        int profit = 0;
        int left = 0;

        // Iterate through the prices array
        for (int right = 1; right < prices.length; right++) {
            // Check if the current price is greater than the price at left pointer
            if (prices[right] > prices[left]) {
                // Calculate the profit and update if it's greater than the current profit
                profit = Math.max(profit, prices[right] - prices[left]);
            } else {
                // Update the left pointer to the current index if the price is not increasing
                left = right;
            }
        }

        // Return the maximum profit
        return profit;
    }
}
