class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Iterate through the array and mark visited elements
        for (int i = 0; i < nums.length; i++) {
            // Calculate the index based on the absolute value of the element
            int index = Math.abs(nums[i]) - 1;
            
            // Mark visited elements by making them negative
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }
        
        // Step 2: Create a list to store disappeared numbers
        List<Integer> list = new ArrayList<>();
        
        // Step 3: Iterate through the array to find positive elements
        for (int i = 0; i < nums.length; i++) {
            // If the element is positive, add its corresponding number to the list
            if (nums[i] > 0) {
                list.add(i + 1);
            }
        }
        
        // Step 4: Return the list of disappeared numbers
        return list;
    }
}



        // // Step 1: Create a HashSet to store unique elements from the array
        // Set<Integer> set = new HashSet<>();
        
        // // Step 2: Add each element from the array to the HashSet
        // for (int val : nums) {
        //     set.add(val);
        // }
        
        // // Step 3: Create an ArrayList to store disappeared numbers
        // ArrayList<Integer> list = new ArrayList<>();
        
        // // Step 4: Iterate from 1 to the length of the array
        // for (int i = 1; i <= nums.length; i++) {
        //     // Step 5: Check if the current number is not present in the HashSet
        //     if (!set.contains(i)) {
        //         // Step 6: If not present, add it to the list of disappeared numbers
        //         list.add(i);
        //     }
        // }
        
        // // Step 7: Return the list of disappeared numbers
        // return list;