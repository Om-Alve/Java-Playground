public class LinearSearchRecursive {
    public static void main(String[] args) {
        int[] arr ={1,2,3,5,6,14};
        int target = 5;
        System.out.println(LinearSearch(arr,target,0));
    }
    static int LinearSearch(int[] arr, int target , int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==target){
            return i;
        }
        return LinearSearch(arr,target,i+1);
    }
}
