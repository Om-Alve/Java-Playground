package CollegeLectures;

import java.util.Scanner;

public class ControlStructures {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = in.nextLine();
        System.out.println("Enter your age:");
        int age = in.nextInt();
        if(age<=0 || age>=100){
            System.out.println("Invalid input");
        }
        else if(age<18){
            System.out.println("Sorry "+name+" You cannot vote. You can vote after "+ (18-age)+" years");
        }
        else {
            System.out.println("Congrats "+name+" You can vote.You are able to vote since " + (age-18) + "years");
        }
    }
}
