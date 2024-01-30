class Solution {
    // Arrays to store word representations
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};

    // Main method to convert number to words
    public String numberToWords(int num) {
        // Handling the case when num is 0
        if (num == 0) return "Zero";

        int i = 0;
        String words = "";

        // Iterate through the number in groups of three digits
        while (num > 0) {
            // If the current group is not 0, add its word representation to the result
            if (num % 1000 != 0)
                words = helper(num % 1000) + THOUSANDS[i] + " " + words;
            // Move to the next group of three digits
            num /= 1000;
            i++;
        }

        // Return the final word representation with trailing spaces trimmed
        return words.trim();
    }

    // Helper method to convert a three-digit number to words
    private String helper(int num) {
        // Base case: if the number is 0, return an empty string
        if (num == 0)
            return "";
        // Case: number is less than 20, use the LESS_THAN_20 array
        else if (num < 20)
            return LESS_THAN_20[num] + " ";
        // Case: number is less than 100, combine TENS and recursively handle the units place
        else if (num < 100)
            return TENS[num / 10] + " " + helper(num % 10);
        // Case: number is 100 or more, combine the word for hundreds place, "Hundred," and the remaining two digits
        else
            return LESS_THAN_20[num / 100] + " Hundred " + helper(num % 100);
    }
}
