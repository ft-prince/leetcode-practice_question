class Solution {
    public boolean isPalindrome(int x) {
            // for -ve  and ends with 0
            if(x<0) return false;
            if(x!=0 && x%10==0) return false ;
            int reverse =0;
            while(x> reverse){
                int lastDigit=x%10;
                reverse=reverse*10+lastDigit;
                x=x/10;
            } 
            return (x==reverse ) || (x==reverse/10);
    }
}


//  TC:O(n)
// SC:O(n)

//  instead of reversing the whole no  you can reverse the half part of it and you can check then this will take    log10X sc:O(1)