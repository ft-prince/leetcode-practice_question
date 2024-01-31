class Solution {
    public boolean containsDuplicate(int[] nums) {
        // Create a HashSet to store unique elements
        Set<Integer> set = new HashSet<>();

        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Check if the current element already exists in the set
            if (set.contains(nums[i])) {
                // If yes, then the array contains a duplicate
                return true;
            } else {
                // If not, add the element to the set
                set.add(nums[i]);
            }
        }

        // If the loop completes without finding a duplicate, return false
        return false;
    }
}

// Approach using HashSet:
// - A HashSet is used to store unique elements.
// - While iterating through the array, check if the current element is already in the HashSet.
// - If yes, return true (duplicate found).
// - If not, add the element to the HashSet.
// - If the loop completes without finding a duplicate, return false.

// Other mentioned approaches:
// - Sorting the array and then checking adjacent elements for equality.
// - Using two nested loops to compare each pair of elements in the array.


