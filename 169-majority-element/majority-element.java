class Solution {
    public int majorityElement(int[] nums) {
        int candidate=nums[0];
        int life=1;
        for(int i=1;i<nums.length;i++){
            if(life==0){
                candidate=nums[i];
            }
            if(candidate==nums[i]) life++;
            else life--;
        }
        return candidate ;
    }
}