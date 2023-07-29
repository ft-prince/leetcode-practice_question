
/*
Online Java - IDE, Code Editor, Compiler

Online Java is a quick and easy tool that helps you to build, compile, test your programs online.
*/

public class Main
{
    public static void main(String[] args) {
        // System.out.println("Welcome to Online IDE!! Happy Coding :)");
      boolean[]board=new boolean[4];
    printans(0,2,board,"",0);
    }
    public static void printans(int qpsf ,int tq, boolean[]board,String ans ,int lastboxused){
        
        if(qpsf==tq){
            System.out.println(ans);
            return;
        }
        for(int i=lastboxused;i<board.length;i++){
            if(board[i]==false){
                board[i]=true;
                printans(qpsf+1,tq,board,ans+"b"+i+"q"+qpsf+" ",i);
                board[i]=false;
            }
        }
    }
}
