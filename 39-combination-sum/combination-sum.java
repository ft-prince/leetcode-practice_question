class Solution {
    public List<List<Integer>> combinationSum(int[] arr, int target) {
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
         combination(arr,target,list,0,ans);
         return ans;
    }
        public static void combination(int[]arr,int amount,List<Integer>list,int last,  List<List<Integer>>ans){
        if (amount==0){
              ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = last; i < arr.length ; i++) {
            if (amount>=arr[i]){
                list.add(arr[i]);
                combination(arr, amount-arr[i], list,i,ans);
                     list.remove(list.size()-1);
                       }
        }
    }

}