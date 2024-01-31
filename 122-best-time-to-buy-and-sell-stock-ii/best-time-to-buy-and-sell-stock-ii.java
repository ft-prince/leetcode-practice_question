class Solution {
    public int maxProfit(int[] prices) {
       // Initialize profit to 0
        int profit = 0;

        // Iterate through the prices array starting from the second day
        for (int i = 1; i < prices.length; i++) {
            // Check if the current day's price is higher than the previous day's price
            if (prices[i - 1] < prices[i]) {
                // If yes, calculate the profit by adding the price difference
                profit += prices[i] - prices[i - 1];
            }
        }

        // Return the total profit
        return profit;
    }
}