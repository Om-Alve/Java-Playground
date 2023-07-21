public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = {4,3,5,2,1};
        bubbleSort(arr,arr.length,0);
        for (int i=0;i<arr.length;i++){
            System.out.printf(String.valueOf(arr[i]));
        }
    }

    private static void bubbleSort(int[] arr, int x, int y) {
        if(x==0){
            return;
        }
        if(y>=x-1){
            bubbleSort(arr,x-1,0);
        }
        else {
            if(arr[y]>arr[y+1]){
            int temp = arr[y];
            arr[y]=arr[y+1];
            arr[y+1] = temp;
        }
            bubbleSort(arr,x,y+1);
        }
    }
}
