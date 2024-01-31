class Solution {
    public int[] productExceptSelf(int[] nums) {
        // Initialize an array to store the prefix products
        int[] prefixProduct = new int[nums.length];
        prefixProduct[0] = 1;

        // Calculate the prefix products
        for (int i = 1; i < nums.length; i++) {
            // The prefix product at index i is the product of all elements before i in the original array
            prefixProduct[i] = prefixProduct[i - 1] * nums[i - 1];
        }

        // Initialize a variable to store the suffix product
        int suffixProduct = 1;

        // Calculate the final result by multiplying prefix and suffix products
        for (int i = nums.length - 1; i >= 0; i--) {
            // The final product at index i is the product of prefixProduct[i] and suffixProduct
            prefixProduct[i] = prefixProduct[i] * suffixProduct;

            // Update the suffix product for the next iteration
            suffixProduct = suffixProduct * nums[i];
        }

        // Return the array containing the product of all elements except self
        return prefixProduct;

    }
}