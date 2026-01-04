class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap();

        for (String str : strs) {
            //  first sort it 
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String key=String.valueOf(arr);
            //  already exist or not 
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            //  add into the list of that key 
            map.get(key).add(str);
        }


        List<List<String>> answer=new ArrayList();

        for(String key : map.keySet()){
            answer.add(map.get(key));
        }
    return answer;
    }
}