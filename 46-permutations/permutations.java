class Solution {
    public List<List<Integer>> permute(int[] nums) {
         boolean visited[]=new boolean[nums.length];
          List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();        
        print(nums,list,ans,visited);
         return ans;    
    }
    public static void print(int []arr, List<Integer>curr,List<List<Integer>>ans, boolean visited[]){
    if(curr.size()==arr.length){
 ans.add(new ArrayList<>(curr));
return;
    }
    for(int i=0;i<arr.length;i++){
      if(visited[i]==false){
        visited[i]=true;
        curr.add(arr[i]);
        print(arr,curr,ans,visited);
        visited[i]=false;
        curr.remove(curr.size()-1);
      }
    }
    } 
       }
