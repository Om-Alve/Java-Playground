import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Scanner;
public class SpiralPrint {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] ans = new int[n][n];
        generateMatrix(n);

    }
    public static void generateMatrix(int n) {
        int Srow = 0,Scol = 0,Erow = n,Ecol = n,index = 1,i=0,j=0;
        int[][] ans = new int[n][n];
        while(index<=n*n){
            while(j<Ecol && index<n*n+1){
                System.out.println(i + " , " + j + " =>" + index);
                ans[i][j++] = index++;
            }
            i++;
            j--;
            while(i<Erow && index<n*n+1){
                System.out.println(i + " , " + j + " =>" + index);
                ans[i++][j] = index++;
            }
            j--;
            i--;
            while(j>=Scol && index<n*n+1){
                System.out.println(i + " , " + j + " =>" + index);
                ans[i][j--] = index++;
            }
            j++;
            i--;
            while(i>Srow && index<n*n+1){
                System.out.println(i + " , " + j + " =>" + index);
                ans[i--][j] = index++;
            }
            i++;
            j++;
            Srow++;
            Scol++;
            Erow--;
            Ecol--;
        }
        for(int[] a:ans){
            System.out.println(Arrays.toString(a));
        }
    }
}
