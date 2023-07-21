import java.util.Scanner;
public class UniqueInArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int ans = 0;
        for (int i=0;i<n;i++){
            ans^=arr[i];
        }
        System.out.println(ans);
    }
}
