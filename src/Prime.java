import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        armstrong();

    }

    static boolean isarmstrong(int n){
        int sum = 0;
        int original = n;
        while (n>0){
            int rem = n%10;
            sum+= rem*rem*rem;
            n/=10;
        }
        return sum == original;
    }
    static void armstrong(){
        for(int i = 100 ; i < 1000 ; i++){
            if(isarmstrong(i)){
                System.out.print(i + " ");
            }
        }
    }
    static boolean isPrime(int n) {
        if(n<1){
            return false;
        }
        for (int i = 2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
}
