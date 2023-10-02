class Solution {
 
    public List<List<String>> groupAnagrams(String[] words) {
Map<String, List<String>> m = new HashMap<>();
        for(String w:words)
        {
            String s=sort(w);
            if(m.containsKey(s))
            {
                List<String>l=m.get(s);
                l.add(w);
                m.put(s,l);
            }
            else
            {
                List<String>l=new ArrayList<>();
                l.add(w);
                m.put(s,l);
                
            }
        }
List<List<String>>ans=new ArrayList();
for(String key:m.keySet())
{
    ans.add(m.get(key));
}
return ans;
    }

    public String sort(String s)
    {
        char a[]=s.toCharArray();
        Arrays.sort(a);
        return new String(a);
    }
}