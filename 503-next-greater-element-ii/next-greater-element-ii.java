class Solution {
    public int[] nextGreaterElements(int[] arr) {
        	   Stack<Integer> st= new Stack<>();
        int[] res = new int[arr.length];
        for(int x =(arr.length-1)*2;x>=0;x--){
          int idx=x%arr.length; // for circular array
        while(!st.isEmpty()&&arr[idx]>=st.peek()){
            st.pop();
        } 
        if(st.isEmpty()){
            res[idx]=-1;
        }
        else{
            res[idx]=st.peek();
        }
        st.push(arr[idx]);
        }
        return res;
    }
}