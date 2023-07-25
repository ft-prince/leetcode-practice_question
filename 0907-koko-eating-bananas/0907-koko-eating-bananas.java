class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right =  Integer.MAX_VALUE;
        int ans=1;
        while(left <= right){
        int mid = left + (right - left) / 2;
                if(canEatInTime(piles, mid, h)) 
            {
                ans=mid;
                right = mid - 1;
            }else left = mid + 1;
        }
        return ans ;
    }
    public boolean canEatInTime(int piles[], int k, int h){
      int currhours=0;
      for(int i=0;i<piles.length;i++){
          int cal=piles[i]/k;
          currhours+=cal;
          if(piles[i]%k!=0){
              currhours++;
          }
      } 
return h>=currhours;
    }
}