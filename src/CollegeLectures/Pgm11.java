package CollegeLectures;

import java.util.Scanner;

public class Pgm11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        System.out.println(str.replace(" ","_"));
    }
}
