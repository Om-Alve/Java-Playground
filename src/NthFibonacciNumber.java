import java.util.Scanner;
public class NthFibonacciNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t1 = 0;
        int t2 = 1;
        if(n == 1){
            System.out.println(t1);
        } else if (n==2) {
            System.out.println(t2);
        }
        int t3 = 0;
        for(int i = 2;i<=n;i++){
            t3 = t1 + t2;
            t1 = t2;
            t2 = t3;
        }
        System.out.println(t3);
    }
}
