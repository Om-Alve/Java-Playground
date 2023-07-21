import java.util.Scanner;
public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new  Scanner(System.in);
        int n = in.nextInt();
        System.out.println(Rev(n,(int)Math.log10(n) + 1));
    }

    private static int Rev(int n,int digits) {
        if(n%10==n){
            return n;
        }
        return (n%10) *(int) Math.pow(10,digits-1) + Rev(n/10,digits-1);
    }
}
