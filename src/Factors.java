import java.util.Scanner;
public class Factors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                if(n/i == i){
                    System.out.println(i+ " ");
                }
                else{
                System.out.print(i + " " + n/i +" " );
                }
            }
        }
    }

}
