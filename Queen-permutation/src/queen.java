

public class Main
{
    public static void main(String[] args) {
        // System.out.println("Welcome to Online IDE!! Happy Coding :)");
      boolean[]board=new boolean[4];
    printans(0,2,board,"");
    }
    public static void printans(int qpsf ,int tq, boolean[]board,String ans ){
        
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                printans(qpsf+1,tq,board,ans+"b"+i+"q"+qpsf+" ");
                board[i]=false;
            }
        }
    }
}
