import java.util.Stack;

public class postfixevalution {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        String exp = "4 3 2 + -";
        for(int i=0;i<exp.length();i++){
            char c = exp.charAt(i);
            if(c==' '){
                continue;
            }
            if (Character.isDigit(c)){
                s.push(c-'0');
            }
            else {
                int b = s.pop();
                int a = s.pop();
                int ans;
                switch (c){
                    case '+':
                        ans = a+b;
                        break;
                    case '-':
                        ans = a-b;
                        break;
                    case '/':
                        ans = a/b;
                        break;
                    case '*':
                        ans = a*b;
                        break;
                    default:
                        throw new IllegalStateException("Unexpected value: " + c);
                }
                s.push(ans);
            }
        }
        System.out.println(s.pop());
    }
}
