import java.util.Scanner;


public class OrderAgnosticBS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int ans = orderAgnosticBS(arr,target);
        System.out.println(ans);
    }

    private static int orderAgnosticBS(int[] arr,int target) {
        if(arr[0] > arr[arr.length - 1]){
            return binarySearchDesc(arr,target);
        } else if (arr[0] < arr[arr.length - 1]) {
            return binarySearchAsc(arr, target);
        }
        else{
            return 0;
        }
    }

    private static int binarySearchAsc(int[] arr, int target) {
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
    static int binarySearchDesc(int[] arr, int target){
        int s = 0, e = arr.length;
        int mid;
        while(s<e){
            mid = s + (e-s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid]>target){
                s = mid + 1;
            }
            else {
                e = mid - 1;
            }
        }
        return -1;
    }
}
