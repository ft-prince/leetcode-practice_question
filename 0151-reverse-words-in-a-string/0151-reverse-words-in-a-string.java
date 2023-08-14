class Solution {
    public String reverseWords(String s) {
          s=s.trim();//for removing space from starting and from ending
        String []arr=s.split("\s+");//+ is for removing space btw the word and "\s" is used for ek string ko array mein convert krne ke liye
        // aur usko word by word submit krne ke liye
        
        
//        for (int i = 0; i < arr.length; i++) {
//            System.out.print(arr[i]+" ");
//        }
String ans="";
        for (int i = arr.length-1; i >=0 ; i--) {
            ans+=arr[i]+" ";
        }
        
        
    return  ans.trim();
    }
}