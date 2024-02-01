class Solution {
    // Method to find duplicate numbers in an array
    public List<Integer> findDuplicates(int[] nums) {
        // List to store duplicate numbers
        List<Integer> list = new ArrayList<>();
        
        // Iterate through the array
        for (int i = 0; i < nums.length; i++) {
            // Calculate the index based on the absolute value of the element
            int index = Math.abs(nums[i]) - 1;
            
            // If the number at the calculated index is negative, it means it's a duplicate
            if (nums[index] < 0) {
                list.add(Math.abs(nums[i])); // Add the duplicate to the list
            }
            
            // Mark visited elements by making them negative
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }
        
        // Return the list of duplicate numbers
        return list;
    }
}



//  first apparoch by using two nested loops 
//  2nd by using hashmap in which we can check the value of the keys if it greater then 1 then we can add 