import java.util.Arrays;
import java.util.Scanner;
public class BinarySearch2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr = new int[n][n];
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int target = in.nextInt();
        int[] ans = Bsearch2D(arr,target);
        System.out.println(Arrays.toString(Bsearch2D(arr, target)));
    }

    private static int[] Bsearch2D(int[][] arr, int target) {
        int rows= arr.length;
        int Srow = 0,Erow = rows - 1;
        int cols = arr[0].length;
        if(cols == 0){
            return new int[]{-1,-1};
        }
        int Mcol = cols/2;
        if(rows == 1){
            return binarySearchAsc(arr,target,0,0,cols-1);
        }
        while(Srow < Erow - 1){
            int mid = Srow + (Erow - Srow)/2;
            if(arr[mid][Mcol] == target){
                return new int[]{mid,Mcol};
            }
            else if(arr[mid][Mcol]<target){
                Srow = mid;
            }
            else{
                Erow = mid;
            }
        }
        if(arr[Srow][Mcol] == target){
            return new int[]{Srow,Mcol};
        }
        if(arr[Erow][Mcol] == target){
            return new int[]{Erow,Mcol};
        }
        int[] f = binarySearchAsc(arr,target,Srow,0,cols - 1);
        if(f[0] == -1){
            return binarySearchAsc(arr,target,Erow,0,cols - 1);
        }
        return f;
    }

    private static int[] binarySearchAsc(int[][] arr, int target, int row,int Scol , int Ecol) {
        int mid;
        while(Scol<=Ecol){
            mid = Scol + (Ecol-Scol)/2;
            if(arr[row][mid] == target){
                return new int[]{row,mid};
            }
            else if(arr[row][mid]>target){
                Ecol = mid - 1;
            }
            else {
                Scol = mid + 1;
            }
        }
        return new int[]{-1,-1};
    }
}
