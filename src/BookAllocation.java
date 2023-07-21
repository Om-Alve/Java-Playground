import java.util.Scanner;
public class BookAllocation {
    public int allocate(int[] arr,int m){
        int s = 0 , e = 0;
        for(int i = 0 ; i < arr.length ; i++){
            s = Math.max(s,arr[i]);
            e += arr[i];
        }
        while(s<e){
            int mid = s + (e - s)/2;
            int sum = 0;
            int pieces = 0;
            for(int a : arr){
                if(sum + a > mid){
                    pieces++;
                    sum = a;
                }
                else{
                    sum+=a;
                }
            }
            if(pieces<=m){
                e = mid;
            }
            else{
                s = mid+1;
            }
        }
        return s;
    }
}
