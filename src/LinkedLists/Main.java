package LinkedLists;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        LinkedList n = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.insertLast(i+1);
        }
        list.insertRec(3,3);
        list.display();
        list.reverse(list.getHead());
        list.display();

    }
}
