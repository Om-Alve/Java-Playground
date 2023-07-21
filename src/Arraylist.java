import java.util.Scanner;
import java.util.ArrayList;
public class Arraylist {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<Integer>(5);
        for(int i = 0 ;i<6;i++){
            arr.add(i);
        }
        System.out.println(arr);
        arr.set(0,1);
        System.out.println(arr);
    }
}
