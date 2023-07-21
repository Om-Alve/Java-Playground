import java.util.Scanner;
public class PrimeBetweenTwoNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        isPrime(n);
    }

    static void printPrime(boolean[] prime,int n) {
        for(int i = 2 ; i < n ; i++){
            if(prime[i]==true){
                System.out.print(i+" ");
            }
        }
    }

    static void isPrime(int n){
        boolean[] prime = new boolean[n+1];
        if(n<1){
            System.out.println("None");
            return;
        }
        for (int i=0;i<=n;i++){
            prime[i]=true;
        }
        for(int i = 2;i*i<n;i++){
            if(prime[i]==true){
                for(int j=i*i;j<n;j+=i){
                    prime[j] = false;
                }
            }
        }
        printPrime(prime,n);
        return;
    }
}
