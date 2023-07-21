import java.util.Scanner;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Nsum(n));
    }

    private static int Nsum(int n) {
        if(n<=0){
            return 0;
        }
        return n%10 + Nsum(n/10);
    }
}
