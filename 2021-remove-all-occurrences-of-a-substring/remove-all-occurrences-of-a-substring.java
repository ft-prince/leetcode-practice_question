class Solution {
    public String removeOccurrences(String s, String part) {
        return makeLuckyString(s,part);
    }
       public static String makeLuckyString(String S, String U) {
        StringBuilder result = new StringBuilder(S);
        int index;

        // Loop to find and remove all occurrences of U from the result
        while ((index = result.indexOf(U)) != -1) {
            result.delete(index, index + U.length());
        }

        return result.toString();
    }

}