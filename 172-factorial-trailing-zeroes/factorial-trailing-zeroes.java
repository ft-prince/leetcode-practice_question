class Solution {
    public int trailingZeroes(int n) {
       int count=0;
       int currPowerOffFive=5;
       while(n>=currPowerOffFive){
           count+=(n/currPowerOffFive);
           currPowerOffFive =currPowerOffFive*5;
       }
     return count;
    }
}



//  number /occurence of 5 in n!