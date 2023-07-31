class Solution {
    public List<List<String>> partition(String s) {
       
        List<String> list=new ArrayList<>();
        List<List<String>>ans=new ArrayList<>();

        print(s,list,ans);
        return ans;
    }
       public static void print(String ques,List<String>list,  List<List<String>>ans){
        if (ques.length()==0){
        //    System.out.println(list);
          ans.add(new ArrayList<>(list));
            return;
        }        
        for (int i = 1; i <=ques.length() ; i++) {
            String ok=ques.substring(0,i);
            if (check(ok)==true){
                list.add(ok);
        print( ques.substring(i), list,ans);
        list.remove(list.size()-1);
    }

    }
}
        public  static  boolean check(String  str){
         int last=str.length()-1;
         for (int i = 0; i< str.length()/2 ; i++) {
         if (str.charAt(i)!=str.charAt(last)){
            return false;
         }
         last--;

     }
     return true;
       }
}