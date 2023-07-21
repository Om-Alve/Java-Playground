import java.util.Scanner;
public class SearchRotatedArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        int target = in.nextInt();
        int ans = Bsearch(arr,target,0,arr.length-1);
        System.out.println(ans);
    }
    static int Bsearch(int[] arr,int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid = s + (e - s)/2;
            if(arr[mid]==target){
                return mid;
            }
        if(arr[s]<=arr[mid]){
            if(arr[s]<=target && arr[mid]>=target){
                return Bsearch(arr,target,s,mid-1);
            }
            else {
                return Bsearch(arr,target,mid+1,e);
            }
        }
        if(target>=arr[mid] && target<=arr[e]){
            return Bsearch(arr,target,mid+1,e);
        }
        else{
            return Bsearch(arr,target,s,mid-1);
        }
    }
        static int binarySearchAsc(int[] arr, int target, int s,int e) {
        int mid;
        while(s<=e){
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
