package Backtracking;

import java.util.Arrays;

public class NQueens {
    public static void main(String[] args) {
        boolean[][] board = {{true,true,true,true},{true,true,true,true},{true,true,true,true},{true,true,true,true}};
        int ans = queens(board,0,0);
        System.out.println(ans);
    }
    static void printArray(boolean[][] arr){
        for (boolean[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
    }
    static int queens(boolean[][] board,int r,int c){
        if(r==board.length){
            printArray(board);
            return 1;
        }
        int count = 0;
        for(int i = 0;i<board.length;i++){
            if(isSafe(board,r,i)){
                board[r][i]=false;
                count+= queens(board,r+1,c);
                board[r][i] = true;
            }
        }
        return count;
    }

    private static boolean isSafe(boolean[][] board, int r, int c) {
        //check vertically
        for (int j = 0; j < r; j++) {
            if(board[j][c] == false){
                return false;
            }
        }
        int i=r,j=c;
        while(i>0 && j>0){
            if(board[--i][--j] == false){
                return false;
            }
        }
        //check diagonally downwards
        i=r;j=c;
        while(i>0 && j<board.length-1){
            if(board[--i][++j] == false){
                return false;
            }
        }
         return true;
    }
}
