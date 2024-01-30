class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] counter = new int[26];  // Assuming only lowercase English letters

        // Count occurrences of characters in string s
        for (int i = 0; i < s.length(); i++) {
            counter[s.charAt(i) - 'a']++;
        }

        // Update counter based on characters in string t
        for (int i = 0; i < t.length(); i++) {
            counter[t.charAt(i) - 'a']--;

            // If at any point, the counter becomes negative, strings are not anagrams
            if (counter[t.charAt(i) - 'a'] < 0) {
                return false;
            }
        }

        // If all characters have been matched, the strings are anagrams
        return true;
    }
}



//   for brute force  O(n)  and SC O(n) in that case you can use HasMap  for s and for t that key value then search from both of them is the key and their values are same or not 
//  for another 
//  if(len(s)! = len(t));
// return false;
//   counter =new int [26]
//   for i from 0 to lens(s)-1
//   counter[s.charAt(i)-'a']++;
//   counter[t.charAt(i)-'a']--;
//   for count in counter
//   if(count!=0)
//   return false
//   return true;
