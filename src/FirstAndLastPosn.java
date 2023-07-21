import java.util.Scanner;
import java.util.Arrays;
public class FirstAndLastPosn {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int f = first(arr,target);
        int l = last(arr,target);
        System.out.println(f + " , " + l);
    }

    private static int last(int[] arr, int target) {
        int s = 0 ,e = arr.length-1,mid,last = -1;
        while(s<=e){
            mid = s + (e - s)/2;
            if(arr[mid]==target){
                last = mid;
                s = mid + 1;
            }
            else if (arr[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return last;
    }

    private static int first(int[] arr, int target) {
        int s = 0 ,e = arr.length-1,mid,first = -1;
        while(s<=e){
            mid = s + (e - s)/2;
            if(arr[mid]==target){
                first = mid;
                e = mid - 1;
            }
            else if (arr[mid] < target){
                s = mid + 1;
            }
            else{
                e = mid - 1;
            }
        }
        return first;
    }
}

