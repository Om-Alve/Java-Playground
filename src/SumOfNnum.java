import java.util.Scanner;
public class SumOfNnum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(calSum(n));
    }

    private static int calSum(int n) {
        int sum = 0;
        for(int i = 1;i <= n;i++){
            sum+=i;
        }
        return sum;
    }
}
