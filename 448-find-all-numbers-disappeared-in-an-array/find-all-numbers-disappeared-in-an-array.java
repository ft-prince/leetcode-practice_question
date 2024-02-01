class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        // Step 1: Create a HashSet to store unique elements from the array
        Set<Integer> set = new HashSet<>();
        
        // Step 2: Add each element from the array to the HashSet
        for (int val : nums) {
            set.add(val);
        }
        
        // Step 3: Create an ArrayList to store disappeared numbers
        ArrayList<Integer> list = new ArrayList<>();
        
        // Step 4: Iterate from 1 to the length of the array
        for (int i = 1; i <= nums.length; i++) {
            // Step 5: Check if the current number is not present in the HashSet
            if (!set.contains(i)) {
                // Step 6: If not present, add it to the list of disappeared numbers
                list.add(i);
            }
        }
        
        // Step 7: Return the list of disappeared numbers
        return list;
    }
}
