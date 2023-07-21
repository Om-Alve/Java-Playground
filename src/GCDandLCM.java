import java.util.Scanner;
public class GCDandLCM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        System.out.println("GCD --> " + GCD(x,y) + "\nLCM --> " + LCM(x,y));
    }

    private static int GCD(int x,int y){
        if(x==0){
            return y;
        }
        return GCD(x%y,x);
    }

    private static int LCM(int x,int y){
        return x*y/(GCD(x,y));
    }
}
