import java.util.Scanner;
public class SearchInMountainArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int ans = Bsearch(arr,target);
        System.out.println(ans);
    }

    private static int Bsearch(int[] arr, int target) {
        int peak = peakIndex(arr);
        if(target == arr[peak]){
            return peak;
        }
        else if(binarySearchAsc(arr, target, 0, peak) != -1){
            return binarySearchAsc(arr,target,0,peak);
        }
        else{
            return binarySearchAsc(arr,target,peak+1,arr.length - 1);
        }
    }

    private static int peakIndex(int[] arr) {
        int s = 0, e = arr.length - 1,mid;
        while(s<e){
            mid = s + (e - s)/2;
            if(arr[mid] > arr[mid + 1]){
                e = mid;
            }
            else{
                s = mid + 1;
            }
        }
        return s;
    }


    private static int binarySearchAsc(int[] arr, int target, int s,int e) {
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
    static int binarySearchDesc(int[] arr, int target ,int s,int e){
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
