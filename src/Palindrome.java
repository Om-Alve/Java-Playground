import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next();
        System.out.println(isPalindrome(str));
    }

    static boolean isPalindrome(String str) {
        if(str.length()==0 || str.length() == 1){
            return true;
        }
        char[] ch = str.toCharArray();
        int i = 0 ,j = ch.length - 1;
        while(i<=j){
            if(ch[i++] != ch[j--]){
                return false;
            }
        }
        return true;
    }
}
