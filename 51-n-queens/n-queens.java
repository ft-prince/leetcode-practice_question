class Solution {
    public List<List<String>> solveNQueens(int n) {     
        char [][] board = new char[n][n];
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board.length; j++) {
                board[i][j] = '.';
            }
        }
        List<List<String>> ans = new ArrayList<>();
        queen(board, 0,n, ans);
        return ans;
    }    
  public static void queen(char[][] board, int row,int tq,List<List<String>> list) {
    if (tq==0){
            list.add(construct(board));
       // System.out.print(ans);
  //  ++count;
        return ;
    }
            for (int i = 0; i < board.length; i++) {
            if (isSafe(board,row,i)==true){
                board[row][i]='Q';
               queen(board, row+1, tq-1,list);
              board[row][i]='.';
            }
          
        }
    }
     static List<String> construct(char[][] board) {

        List<String> internal = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = new String(board[i]);
            internal.add(row);
        }
        return internal;
    }

    private static boolean isSafe(char[][] board, int row, int col) {
       //upword
        int r=row;
        while (r>=0){
            if (board[r][col]=='Q'){
                return false;
            }
            r--;
        }
        //right diagonal
        r=row;
        int c=col;
        while (r>=0&&c< board.length){
            if (board[r][c]=='Q'){
                return false;
            }
            c++;
            r--;
        }
        //left diagonal
        r=row;
        c=col;
        while(r>=0&&c>=0){
            if (board[r][c]=='Q'){
                return false;
            }
            c--;
            r--;
        }
        return true;
    }
}