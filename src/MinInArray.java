import java.util.Scanner;
public class MinInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(minimum(arr));
    }

    private static int minimum(int[] arr) {
        int mini = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        return mini;
    }
}
