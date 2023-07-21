import java.util.Scanner;
public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans=0;
        while(true){
            System.out.println("Enter an operator");
            char op = in.next().trim().charAt(0);
            if(op == '+' || op == '-' || op == '/' || op == '*' || op == '%'){
                System.out.println("Enter two numbers :");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(op == '+'){
                    ans = num1+num2;
                } else if (op =='-') {
                    ans = num1 - num2;
                } else if (op =='*') {
                    ans = num1 * num2;
                } else if (op =='/') {
                    if (num2 == 0){
                        System.out.println("Can't divide by 0.");
                    }
                    else {
                        ans = num1 / num2;
                    }
                } else {
                    ans = num1 % num2;
                }
                System.out.println(ans);
            } else if (op =='x' || op == 'X') {
                break;
            }
            else{
                System.out.println("Invalid operator!");
            }
        }
    }
}
