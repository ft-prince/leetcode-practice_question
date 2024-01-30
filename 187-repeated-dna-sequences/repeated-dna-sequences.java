class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        // Create a HashMap to store substrings of length 10 and their frequencies
        Map<String, Integer> map = new HashMap<>();

        // Iterate through the input string to find substrings of length 10
        for (int i = 0; i <= s.length() - 10; i++) {
            String substring = s.substring(i, i + 10);
            // Update the frequency of the substring in the HashMap
            map.put(substring, map.getOrDefault(substring, 0) + 1);
        }

        // Create a list to store repeated DNA sequences
        List<String> list = new ArrayList<>();

        // Iterate through the entries in the HashMap
        for (Map.Entry<String, Integer> item : map.entrySet()) {
            // If the frequency of a substring is greater than 1, it is repeated
            if (item.getValue() > 1) {
                // Add the repeated substring to the list
                list.add(item.getKey());
            }
        }

        // Return the list of repeated DNA sequences
        return list;
    }
}