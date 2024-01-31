class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        // String representing all digits in order
        String str = "123456789";
        List<Integer> list = new ArrayList<>();

        // Iterate through the possible lengths of sequential digits
        for (int i = 1; i <= 9; i++) {
            // Iterate through the starting positions
            for (int j = 0; i + j <= 9; j++) {
                // Extract a substring representing the sequential digits
                String tmp = str.substring(j, i + j);
                
                // Convert the substring to an integer
                int val = Integer.valueOf(tmp);

                // Check if the value is within the specified range [low, high]
                if (val >= low && val <= high) {
                    // If yes, add it to the list
                    list.add(val);
                }
            }
            
        }

        // Return the list of sequential digits within the specified range
        return list;
    }
}
