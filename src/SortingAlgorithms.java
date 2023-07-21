import java.util.Arrays;
import java.util.Scanner;
public class SortingAlgorithms {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        int[] sorted = cyclicSort(arr);
        System.out.println(Arrays.toString(sorted));
    }

    private static int[] bubbleSort(int[] arr) {
        // Bubble Sort
        // The outer loop runs through the array and the inner loop compares adjacent elements
        // If the first element is greater than the second element, they are swapped
        // This process is repeated until the entire array is sorted

        // The algorithm also includes an optimization to check if the array is already sorted
        // If it is, the function returns the array and the sorting process is stopped

        int n = arr.length;
        boolean sorted = true;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n - i - 1 ; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    sorted = false;
                }
            }
            if(sorted == true){
                return arr;
            }
        }
        return arr;
    }
    static int[] selectionSort(int[] arr){

        // Selection Sort
        // The outer loop runs through the array and sets the last unsorted element each iteration
        // The inner loop finds the maximum value in the unsorted portion of the array
        // Once the maximum value is found, it is swapped with the last unsorted element
        // The process is repeated until the entire array is sorted

        for(int i = 0 ; i < arr.length;i++){
            int last = arr.length - 1 - i;
            int maxi=0;
            for(int j = 0 ; j <= last;j++){
                if(arr[j]>arr[maxi]){
                    maxi = j;
                }
            }
            int temp = arr[last];
            arr[last] = arr[maxi];
            arr[maxi] = temp;
        }
        return arr;
    }
    static int[] insertionSort(int[] arr){
        // Insertion Sort
        // This method sorts an array using the insertion sort algorithm.
        // It iterates through the array and compares each element to the ones before it,
        // swapping them if necessary until the element is in the correct position in the sorted array.

        for(int i = 0;i<arr.length-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j] < arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j -1] = temp;
                }
                else{
                    break; 
                }
            }
        }
        return arr;
    }

    static int[] cyclicSort(int[] arr){
        // Cyclic Sort
        // Whenever there is mention of 1 to n numbers in the array, use Cyclic Sort.
        // It iterates through the array and compares each element to its correct index (determined by the value of the element - 1).
        // If the element is not in the correct index, it swaps it with the element at the correct index.
        // If the element is already in the correct index, it moves on to the next element .
        for(int i = 0 ; i < arr.length;){
            int correctIndex = arr[i] - 1;
            if(arr[i] != arr[correctIndex]){
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            }
            else{
                i++;
            }
        }
        return arr;
    }
}
