class Solution {
    public void sortColors(int[] nums) {

        //selection sorting algorithm
       
         for(int counter=0;counter<nums.length-1;counter++){
           int min=counter;    
         for(int i=counter+1;i<nums.length;i++){
             if(nums[i]<nums[min]){
              min=i;   
              }
          }  
          int temp=nums[min];
            nums[min]=nums[counter];
            nums[counter]=temp;
      }   
    // return nums; 
    }
}