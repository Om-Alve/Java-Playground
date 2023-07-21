import java.util.Scanner;
public class Diamond {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1;i<=n;i++){
            for(int j = 1;j<=n;j++){
                if(j<=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        for (int i = 0;i<n;i++){
            for(int j = n;j>0;j--){
                if(j>=n-i){
                    System.out.print(" ");
                }
                else{
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }
}
