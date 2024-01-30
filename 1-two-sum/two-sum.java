class Solution {
    public int[] twoSum(int[] nums, int target) {
        // Initialize an array to store the resulting indices
        int[] ans = new int[2];
        
        // Create a HashMap to store the difference between target and current element along with its index
        HashMap<Integer, Integer> map = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            int diff = target - nums[i];

            // Check if the difference is already in the HashMap
            if (map.containsKey(diff)) {
                // If found, update the result array with current index and the stored index
                ans[0] = i;
                ans[1] = map.get(diff);
                break; // Break the loop since a solution is found
            } else {
                // If not found, store the current element and its index in the HashMap
                map.put(nums[i], i);
            }
        }

        // Return the resulting array with indices
        return ans;
    }
}
