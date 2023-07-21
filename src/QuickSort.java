import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] a={7,6,3,4,5,2,1};
        quickSort(a,0,a.length - 1);
        System.out.println(Arrays.toString(a));
    }
    private static void quickSort(int[] arr, int low, int high) {
        if(low>=high){
            return;
        }
        int s=low,e=high,mid=s+(e-s)/2;
        while(s<e) {
            while(arr[mid]>arr[s]){
                s++;
            }
            while(arr[mid]<arr[e]){
                e--;
            }
            if(s<=e){
            int temp = arr[s];
            arr[s] = arr[e];
            arr[e] = temp;
            s++;
            e--;
            }
        }
        quickSort(arr,s,high);
        quickSort(arr,low,e);
    }
}
