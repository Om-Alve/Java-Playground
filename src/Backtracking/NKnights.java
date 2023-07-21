package Backtracking;

import java.util.Arrays;

public class NKnights {
    public static void main(String[] args) {
        int n=4 ;
        boolean[][] board = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = false;
            }
        }
        knights(board,0,0,0);

    }
    static void printArray(boolean[][] arr){
        for (boolean[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
    }
    private static void knights(boolean[][] board, int r, int c,int knight) {

        if (knight == board.length) {
            printArray(board);
            return;
        }
        int count = 0;
        if(isSafe(board,r,c)){
            board[r][c] = true;
            knights(board,r,c+1,knight+1);
            board[r][c] = false;
        }
        if(c==board.length){
            knights(board,r+1,0,knight);
        }
        if(r>=board.length || c>=board.length){
            return;
        }
        knights(board,r,c+1,knight);
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        //row and column limits
        if(c>=0 && c<board.length && r>=0 && r<board.length) {
            int rl = board.length, cl = board.length;
            //targets
            int tr = r - 2, tc = c + 1;
            if (tr >= 0 && tc < cl && board[tr][tc] == true) {
                return false;
            }
            tc = c - 1;
            if (tr >= 0 && tc >= 0 && board[tr][tc] == true) {
                return false;
            }
            tc = c - 2;
            tr = r - 1;
            if (tr >= 0 && tc >= 0 && board[tr][tc] == true) {
                return false;
            }
            tc = c + 2;
            if (tr >= 0 && tc < cl && board[tr][tc] == true) {
                return false;
            }
            return true;
        }
        return false;
    }
}
