import java.util.Scanner;
public class Half_pyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        print_pattern(n);
    }
    static void print_pattern(int n){
        for (int i=0;i<n;i++)
        {
            for (int j=0;j<=n;j++) {
                if(j<=n-i) {
                    System.out.print(" ");
                }
                else {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
