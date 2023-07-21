import java.util.Scanner;
public class CheckCase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char c = input.next().trim().charAt(0);
        if(c>='a' && c<='z'){
            System.out.println("Lowercase");
        } else if (c>='A' && c>='Z') {
            System.out.println("Uppercase");
        }
        else{
            System.out.println("Not an alphabet!");
        }
    }
}
