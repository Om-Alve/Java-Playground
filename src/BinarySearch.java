import java.util.Scanner;
import java.util.Arrays;


public class BinarySearch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int ans = binarySearch(arr,target);
        System.out.println(ans);
    }

    private static int binarySearch(int[] arr, int target) {
        int s = 0, e = arr.length;
        int mid;
        while(s<e){
            mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                e = mid - 1;
            }
            else {
                s = mid + 1;
            }
        }
        return -1;
    }
}
