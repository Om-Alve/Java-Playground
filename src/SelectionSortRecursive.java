public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] arr={5,4,3,2,1};
        selectionSort(arr,arr.length ,0,0);
        for (int i=0;i<arr.length;i++){
            System.out.printf(String.valueOf(arr[i]));
        }
    }

    private static void selectionSort(int[] arr, int x, int y,int z) {
        if(x==0){
            return;
        }
        if(y<x){
            if(arr[y]>arr[z]){
                selectionSort(arr,x,y+1,y);
            }
            else {
                selectionSort(arr,x,y+1,z);
            }
        }
        else{
            int temp = arr[z];
            arr[z] = arr[x-1];
            arr[x-1] = temp;
            selectionSort(arr,x-1,0,0);
        }
    }
}
