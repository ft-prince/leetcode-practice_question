class Solution {
    public void reverseString(char[] s) {
        // Initialize two pointers, left at the beginning, and right at the end
        int left = 0;
        int right = s.length - 1;
        
        // Continue swapping characters until left is greater than or equal to right
        while (left < right) {
            // Swap characters at left and right positions
            char temp = s[left];
            s[left] = s[right];
            s[right] = temp;
            
            // Move the pointers towards the center
            left++;
            right--;
        }
    }
}
