class Solution {
    public int[] productExceptSelf(int[] nums) {
    int n=nums.length;
     int multi=1;
     int ans[]=new int[n];
     //for left
     for(int i=0;i<n;i++){
         ans[i]=multi;
         multi*=nums[i];
     }
     // for right
     multi=1;
     for(int i=n-1;i>=0;i--){
         ans[i]*=multi;
         multi*=nums[i];
     }
    return ans;
    }
}