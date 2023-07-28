class Solution {
        static String arr[]={"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};

    public List<String> letterCombinations(String digits) {
          List<String>ll=new ArrayList<>();
          if(digits.length() == 0){
              return ll;
          } 
            printing(digits,"",ll);
        return ll;
    }
     public static  void printing(String ques,String ans,List<String>ll){
      //  List<String>ll=new ArrayList<>();

        if (ques.length()==0){
            // System.out.println(ans+" ");
           ll.add(ans);
            return ;
        }
          // first we need a first no like 23-->2
         char ch=ques.charAt(0);
         // then we need the string present of that index of key where it is present
         String key=arr[ch-'0'];
            
        //traverse on that key 
        for(int i=0;i<key.length();i++){
            printing(ques.substring(1),ans+key.charAt(i),ll);
        }
    }
}