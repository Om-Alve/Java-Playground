import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if((n&1)==1){
            System.out.println("Odd");
        }
        else {
            System.out.println("Even");
        }
    }
}
