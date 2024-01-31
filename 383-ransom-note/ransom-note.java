class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] frequency = new int[26];

        // Count the frequency of each character in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            frequency[c - 'a']++;
        }

        // Check if the characters in the ransomNote can be constructed from the magazine
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            if (frequency[c - 'a'] == 0) {
                // If the frequency of a character is zero, it cannot be constructed
                return false;
            }
            frequency[c - 'a']--;
        }

        // If all characters in ransomNote can be constructed, return true
        return true;
    }
}



//  first  approach we can use the hasMap and then we can check the frequency 
