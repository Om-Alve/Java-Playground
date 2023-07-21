import java.util.Scanner;
public class PeakIndexInMountainArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        int peak = peakIndex(arr);
        System.out.println(peak);
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
}
