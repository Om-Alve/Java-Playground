import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int base = in.nextInt();
        int pow = in.nextInt();
        int ans=1;
        while(pow>0){
            if((pow&1) == 1){
                ans*=base;
            }
            base*=base;
            pow = pow>>1;
        }
        System.out.println(ans);
    }
}
