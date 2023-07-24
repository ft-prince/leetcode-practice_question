class Solution {
    public void sortColors(int[] nums) {

        //bubble sorting algorithm
         for(int counter=0;counter<nums.length-1;counter++){
          for(int i=0;i<nums.length-1-counter;i++){
              if(nums[i]>nums[i+1]){
                  int temp=nums[i];
                  nums[i]=nums[i+1];
                  nums[i+1]=temp;
              }
          }
      }   
    // return nums; 
    }
}