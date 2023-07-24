class Solution {
    public int maxProfit(int[] prices) {
     int buyprice=prices[0];
     int profit=0;
     for(int i=1;i<prices.length;i++){
       //buy it if you're getting profit
        if(prices[i]>buyprice){
            profit=Math.max(prices[i]-buyprice,profit);
        }
        //sell it 
        else{
        buyprice=prices[i];
        }
     }   
     return profit;
    }
}