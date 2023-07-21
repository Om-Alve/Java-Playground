package CollegeLectures;

public class Strings {
    public static void main(String[] args) {
        String str = "Vidyalankar";
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.charAt(6));
        System.out.println("Does string contain the character sequence - alan? Using contains method: \n"+str.contains("alan"));
        System.out.println("indexOf method gives the first index of any character for example index of l is "+ str.indexOf('l'));
        System.out.println();
    }
}
