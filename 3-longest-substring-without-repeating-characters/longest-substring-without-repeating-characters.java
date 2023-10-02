class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character,Integer>map=new HashMap<>();
        int ans=0;
        int j=0;
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
              j=Math.max(map.get(ch)+1,j);
            }
            
            
             ans=Math.max(ans,i-j+1);
                map.put(ch,i);
            
        }
        return ans;
    }
}