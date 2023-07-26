class Solution {
    public List<String> generateParenthesis(int n) {
       List<String>ll=new ArrayList<>();
GenrateParemthese(n,0,0,"",ll);
    return ll;
    }
    public static void GenrateParemthese(int num,int open,int close,String ans,List<String>ll){
        
        if (open==num&&close==num){
            //System.out.println(ans+" ");
            ll.add(ans);
            return;
        }
        if (open<num) {
            GenrateParemthese(num, open + 1, close, ans +"(",ll);

        }
        if (close<open){
            GenrateParemthese(num, open , close+1, ans +")",ll);

        }
    }

    }