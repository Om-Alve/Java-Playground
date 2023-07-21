import java.util.Arrays;
import java.util.Scanner;
public class Array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for(int row = 0 ; row < 3; row++){
            for(int col = 0;col<3;col++){
                arr[row][col]= in.nextInt();
            }
        }
        for(int[] a:arr){
            System.out.println(Arrays.toString(a));
        }
    }
}
