class Solution {
    public int singleNumber(int[] nums) {
int singleNum=0;
     for(int num:nums){
    singleNum=singleNum^num;
}
return singleNum;
    }
 }


   //TC: O(N) SC:-O(N)
        // if(nums.length==1) return nums[0];
        // Set<Integer>set=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(set.contains(nums[i])){
        //         set.remove(nunms[i]);
        //     }
        //     else{
        //         set.add(nums[i]);
        //     }
        // }
        // return set.iterator().next();