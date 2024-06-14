import java.util.*;

public class Nqueens {

    public static boolean isSafe(char board[][], int row, int col){  //neeche har bar col value change hori thi isliye neeche j lia
        //vertical up 
        for(int i=row-1; i>=0; i--){   //col fixed, row will be decreased by 1
            if(board[i][col] == 'Q'){
                return false;
            }
        }
        //left diagonal up
        for(int i=row-1, j=col-1; i>=0 && j>=0; i--, j--){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        //right diagonal up
        for(int i=row-1, j=col+1; i>=0 && j<board.length; i--, j++){
            if(board[i][j] == 'Q'){
                return false;
            }
        }
        return true;
    }

    public static void nQueens(char board[][], int row) {
        // base case
        if (row == board.length) { // board.length=2;
            //printBoard(board);
            count++;
            return;
        }
        // queen ko bithana shuru kar//column loop
        for (int j = 0; j < board.length; j++) {
            if(isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Q ko bithaya
                nQueens(board, row + 1); // aage vale N queens ko call lagaya
                board[row][j] = '.'; // backtrack kia toh voh jagah khaali ho gayi
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("-------ChessBoard-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    static int count=0;

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        // initialise
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = '.'; // matlab board ki har position khaali hai.
            }
        }
        nQueens(board, 0); // 0 is row
        System.out.print("Total ways are "+ count);
    }
}
