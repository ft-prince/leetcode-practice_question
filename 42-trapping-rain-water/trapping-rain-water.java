class Solution {
    public int trap(int[] height) {
        int left = 0; // Pointer for the left side
        int right = height.length - 1; // Pointer for the right side
        int leftbar = height[0]; // Initialize the leftmost bar height
        int rightbar = height[right]; // Initialize the rightmost bar height
        int ans = 0; // Variable to store the total trapped water
        
        // Loop until the left pointer crosses the right pointer
        while (left <= right) {
            // Determine which bar is limiting (left or right)
            if (leftbar < rightbar) {
                // If the height of the current position is greater than the left bar
                if (height[left] > leftbar) {
                    leftbar = height[left]; // Update the left bar height
                } else {
                    ans += leftbar - height[left]; // Add trapped water between left bar and current position
                    left++; // Move the left pointer to the next position
                }
            } else {
                // If the height of the current position is greater than the right bar
                if (height[right] > rightbar) {
                    rightbar = height[right]; // Update the right bar height
                } else {
                    ans += rightbar - height[right]; // Add trapped water between right bar and current position
                    right--; // Move the right pointer to the previous position
                }
            }
        }
        return ans; // Return the total trapped water
    }
}
