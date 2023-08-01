class Solution {
    public List<List<Integer>> combine(int n, int k) {
     boolean[]arr=new boolean[n];
        List<Integer>list=new ArrayList<>();
        List<List<Integer>>ans=new ArrayList<>();
        combi(arr,k,0,list,0,ans);
        return ans;
    }
        public static void combi(boolean[]arr,int queen,int qpsf,List<Integer>list,int last,  List<List<Integer>>ans){
        if (queen==qpsf){
            ans.add(new ArrayList<>(list));
           return;
        }
    for(int i=last;i<arr.length;i++){
        if(arr[i]==false){
            arr[i]=true;
                list.add(i+1);
            combi(arr,queen,qpsf+1,list,i+1,ans);
          arr[i]=false;
           list.remove(list.size()-1);
        
        }
    }
    

    }

}