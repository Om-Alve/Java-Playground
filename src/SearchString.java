import java.util.Scanner;
public class SearchString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next().trim();
        char target = in.next().trim().charAt(0);
        System.out.println(search(str,target));
    }

    private static boolean search(String str, char target) {
        for(int i = 0 ; i < str.length() ; i++){
            if(target == str.charAt(i)){
                return true;
            }
        }
        return false;
    }
}
