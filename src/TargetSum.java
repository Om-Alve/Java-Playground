import java.util.Arrays;

public class TargetSum {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,1};
        System.out.println(solve(nums,3,0));
    }
    static int solve(int[] arr,int target,int sum){
        if(arr.length==0){
            if(sum == target){
                return 1;
            }
            else{
                return 0;
            }
        }
        return solve(Arrays.copyOfRange(arr,1,arr.length),target,sum+arr[0])+        solve(Arrays.copyOfRange(arr,1,arr.length),target,sum-arr[0]);
    }
}
