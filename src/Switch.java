import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String fruit = in.next();
        switch (fruit) {
            case "Mango" -> System.out.println("King of fruits");
            case "Apple" -> System.out.println("A sweet red fruit");
            case "Grapes" -> System.out.println("Small fruit");
            case "Orange" -> System.out.println("Round Fruit");
            default -> System.out.println("Enter a valid fruit");
        }
    }
}
