import java.util.Scanner;
public class Pattern31 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0;i<(2*n)-1;i++){
            for(int j=0;j<(2*n)-1;j++){
                int x = n + 1 - Math.min(Math.min(i+1,j+1),Math.min(2*n-i-1,2*n-j-1));
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
