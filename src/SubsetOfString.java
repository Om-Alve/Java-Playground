import java.util.*;

public class SubsetOfString {
    public static void main(String[] args) {
        String str = "abc";
        printSubset(str,"");
//        System.out.println(ans);
    }

    private static void printSubset(String str, String sub) {
        if (str.isEmpty()){
            System.out.println(sub + " ");
            return;
        }
        printSubset(str.substring(1),sub + str.charAt(0));
        printSubset(str.substring(1),sub);
    }
}
