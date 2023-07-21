package Backtracking;

import javax.swing.*;

public class SudokuSolver {
    public static void main(String[] args) {
        int[][] board = {
                {5, 3, 0, 0, 7, 0, 0, 0, 0},
                {6, 0, 0, 1, 9, 5, 0, 0, 0},
                {0, 9, 8, 0, 0, 0, 0, 6, 0},
                {8, 0, 0, 0, 6, 0, 0, 0, 3},
                {4, 0, 0, 8, 0, 3, 0, 0, 1},
                {7, 0, 0, 0, 2, 0, 0, 0, 6},
                {0, 6, 0, 0, 0, 0, 2, 8, 0},
                {0, 0, 0, 4, 1, 9, 0, 0, 5},
                {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };
        solve(board,0,0);
    }
    static void solve(int[][] board,int r,int c){
        if (check(board)) {
            printBoard(board);
            return;
        }
        if (board[r][c] != 0) {
            if (c < board[0].length-1) {
                solve(board, r, c + 1);
            } else {
                solve(board, r + 1, 0);
            }
        } else {
            for (int j = 1; j <= 9; j++) {
                if (isSafe(board, r, c, j)) {
                    board[r][c] = j;
                    if (c < board[0].length-1) {
                        solve(board, r, c + 1);
                    } else {
                        solve(board, r + 1, 0);
                    }
                    board[r][c] = 0;
                }
            }
        }
    }

    private static void printBoard(int[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }

    static boolean check(int[][] board){
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j <board.length; j++) {
                if(board[i][j]==0){
                    return false;
                }
            }
        }
        return true;
    }
    static boolean isSafe(int[][] board,int r,int c,int num){
        //check row and column
        for (int i = 0; i < board.length; i++) {
            if(board[r][i]==num){
                return false;
            }
            if(board[i][c] == num){
                return false;
            }
        }
        int sqrt = (int) (Math.sqrt(board.length));
        int rowStart = r - r % sqrt;
        int colStart = c - c % sqrt;
        for (int i = rowStart; i < rowStart+sqrt; i++) {
            for (int j = colStart; j < colStart+sqrt; j++) {
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;
    }
}
