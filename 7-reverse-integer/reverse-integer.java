class Solution {
    public int reverse(int x) {
        int min = Integer.MIN_VALUE;
        int max = Integer.MAX_VALUE;

        if (x == min || x == max) 
            return 0;

        int rev = 0;
        while (x != 0) {
            int lastDigit = x % 10;  // getting the last digit
            if (rev > max / 10) 
                return 0;  // +ve int overflow check
            if (rev < min / 10) 
                return 0;  // -ve int overflow check
            rev = rev * 10 + lastDigit;
            x = x / 10;  // removing the last digit
        }

        return rev;
    }
}
