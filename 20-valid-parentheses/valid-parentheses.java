class Solution {
    public boolean isValid(String s) {
        
         Stack<Character> st=new Stack<>();
         for (int i = 0; i < s.length(); i++) {
             char x=s.charAt(i);
        	 if(x=='(' || x=='{' || x=='[') 
            	 st.push(x);

            else if(!st.isEmpty()){
        	 if((x==')' && st.peek()=='(') ||
              (x=='}' && st.peek()=='{' )
              ||( x==']'&& st.peek()=='[')){
             st.pop();
             }
	           else  
        		 return false;  
             }
            else  return false;             
             }
		if(st.empty()) {
			return true;
		}
		 return false;

    }
}



//  approach first we can use hasMap for ):( 