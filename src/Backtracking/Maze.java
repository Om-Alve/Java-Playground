package Backtracking;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
        boolean[][] maze = {{true,true,true},{true,true,true},{true,true,true}};
        int[][] path = {{0,0,0},{0,0,0},{0,0,0}};
        solve(0,0,"",maze,path,1);
    }
    static void printArray(int[][] arr){
        for (int[] a:arr) {
            System.out.println(Arrays.toString(a));
        }
        System.out.println();
    }
    private static void solve(int i, int j,String p,boolean[][] maze,int[][] path,int step) {
        if(maze[i][j] == false){
            return;
        }
        if(i==maze.length -1 && j==maze.length - 1){
//            System.out.println(p);
            path[i][j] = step;
            printArray(path);
            path[i][j] = 0;
            return;
        }
        maze[i][j] =false;
        path[i][j] = step;
        if(i< maze.length -1){
            solve(i+1,j,p+'D',maze,path,step+1);
        }
        if(i > 0){
            solve(i-1,j,p+'U',maze,path,step+1);
        }
        if(j < maze[0].length-1){
            solve(i,j+1,p+'R',maze,path,step+1);
        }
        if(j>0){
            solve(i,j-1,p+'L',maze,path,step+1);
        }
        maze[i][j] =true;
        path[i][j] = 0;
    }
}
