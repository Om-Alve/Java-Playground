import java.util.Scanner;
public class CeilingOfNum {
    public static void main(String[] args) {
        Scanner in  = new Scanner(System.in);
        int[] arr = {2,4,5,7,15,18};
        int target = 6;
        int ceil = ceiling(arr,target);
        int flr = floor(arr,target);
        System.out.println(ceil + " " + flr);
    }

    private static int ceiling(int[] arr, int target) {
        int s = 0,e = arr.length - 1,mid;
        int ans = -1;
        while(s<=e){
            mid = s + (e - s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] > target){
                e = mid - 1;
                ans = arr[mid];
            }
            else{
                s = mid + 1;
            }
        }
        return ans;
    }
    private static int floor(int[] arr, int target) {
        int s = 0,e = arr.length - 1,mid;
        int ans = -1;
        while(s<=e){
            mid = s + (e - s)/2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                s = mid + 1;
                ans = arr[mid];
            }
            else{
                e = mid - 1;
            }
        }
        return ans;
    }
}
