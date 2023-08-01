class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
         boolean visited[]=new boolean[nums.length];
        Arrays.sort(nums);
          List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();        
        print(nums,list,ans,visited,0);
         return ans;     
    }
     public static void print(int []arr, List<Integer>curr,List<List<Integer>>ans, boolean visited[],int idx){
    if(curr.size()==arr.length){
              ans.add(new ArrayList<>(curr));
return;
    }
    for(int i=0;i<arr.length;i++){
      if(visited[i]==true)  
      continue;
       if(i > 0 && !visited[i-1] && arr[i] == arr[i-1]) continue;
        visited[i]=true;
        curr.add(arr[i]);
        print(arr,curr,ans,visited,idx);
        visited[i]=false;
        curr.remove(curr.size()-1);
      
    }
    } 
}