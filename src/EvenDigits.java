import java.util.Scanner;
public class EvenDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0 ; i < n; i++){
            arr[i] = in.nextInt();
        }
        System.out.println(findEvenDigi(arr));
    }

    private static int findEvenDigi(int[] arr) {
        int count = 0;
        for(int a : arr){
            if(even(a)){
                count++;
            }
        }
        return count;
    }

    private static boolean even(int n) {
        if(n<0){
            n*=-1;
        }
        int digits = 0;
        while(n>0){
            n/=10;
            digits++;
        }
        return digits%2 == 0;
    }
}
