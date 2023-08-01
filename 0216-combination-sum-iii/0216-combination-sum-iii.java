class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
         boolean[]arr=new boolean[9];
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        combi(arr,k,0,list,0,ans,n);
        return ans;
    }
      public static void combi(boolean[]arr,int queen,int qpsf,List<Integer>list,int last,  List<List<Integer>>ans,int n){
  
     if(qpsf==queen){

         int sum=0;
         for(int i:list){
             sum+=i;
         }
         if(sum==n){
                                        ans.add(new ArrayList<>(list));
         }
         return;
     }
    
    
     for(int i=last;i<arr.length;i++){
         if(arr[i]==false){
             arr[i]=true;
             list.add(i+1);
             combi(arr,queen,qpsf+1,list,i+1,ans,n);
            arr[i]=false;         
                    list.remove(list.size()-1);

         }
     }

    }
}