public class CheckSortedArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(checkSorted(arr,0));
    }

    static boolean checkSorted(int[] arr, int i) {
        if(i==arr.length-1){
            return true;
        }
        return (arr[i]<arr[i+1]) && checkSorted(arr,i+1);
    }
}
