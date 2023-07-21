import java.util.Arrays;
public class MergeSort {
    public static void main(String[] args){
        int[] a= {1,5,4,3,2};

        System.out.println(Arrays.toString(mergeSort(a)));
        mergeSortInPlace(a,0,a.length);
        System.out.println(Arrays.toString(a));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length==1){
            return arr;
        }
        int mid = arr.length / 2;
        int[] a = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] b = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(a,b);

    }
    static int[] merge(int[] a, int[] b){
        int[] c = new int[a.length+b.length];
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<b[j]){
                c[k++]=a[i++];
            }
            else {
                c[k++] = b[j++];
            }
        }
        while(i<a.length){
            c[k++] = a[i++];
        }
        while (j<b.length){
            c[k++] = b[j++];
        }
        return c;
    }
    static void mergeSortInPlace(int[] arr,int s,int e){
        if(e-s==1){
            return;
        }
        int mid = s + (e-s)/2;
        mergeSortInPlace(arr,s,mid);
        mergeSortInPlace(arr,mid,e);

        mergeInplace(arr,s,e);
    }
    static void mergeInplace(int[] arr, int s,int e){
        int mid = s + (e-s)/2;
        int[] copy = new int[e-s];
        int i=s,j=mid,k = 0;
        while(i<mid && j<e){
            if(arr[i] < arr[j]){
                copy[k++] = arr[i++];
            }
            else{
                copy[k++] = arr[j++];
            }
        }
        while(i<mid){
            copy[k++] = arr[i++];
        }
        while(j<e){
            copy[k++] = arr[j++];
        }
        for(k=0;k< copy.length;k++){
            arr[s+k] = copy[k];
        }
    }
}
