class Solution {
    public int lengthOfLastWord(String s) {
        int right = s.length() - 1;

        // Move right pointer to the first non-space character from the end
        while (right >= 0 && s.charAt(right) == ' ') {
            right--;
        }

        // Set left pointer to the end of the last word
        int left = right;

        // Move left pointer to the beginning of the last word
        while (left >= 0 && s.charAt(left) != ' ') {
            left--;
        }

        // Calculate and return the length of the last word
        return right - left;
    }
}
