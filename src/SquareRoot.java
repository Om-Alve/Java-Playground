import java.util.Scanner;
public class SquareRoot {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        double root = sqrroot(n,p);
        System.out.println(root + " " +NewtonSqrt(n));
    }

    private static double sqrroot(int n,int p) {
        double ans = 0.0;
        int s=0,e=n,mid;
        while(s<=e){
            mid = s + (e - s) / 2;
            if(mid*mid == n){
                return mid;
            } else if (mid*mid > n) {
                e = mid - 1;
            }
            else{
                s = mid + 1;
                ans = mid;
            }
        }
        double factor = 0.1;
        for(int i = 0;i<p;i++ ){
            while(ans*ans<=n){
                ans+=factor;
            }
            ans-=factor;
            factor /= 10;
        }
        return ans;
    }
    private static double NewtonSqrt(int n){
        double x = n,root ;
        while(true){
            root = 0.5 * (x+(n/x));
            if(Math.abs(root - x)<1){
                break;
            }
            x = root;
        }
        return root;
    }
}
