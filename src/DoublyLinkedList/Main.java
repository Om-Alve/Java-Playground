package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        DLL list  = new DLL();
        for (int i = 0; i < 5; i++) {
            list.insertFirst(i+1);
        }
        list.insert(4,0);
        list.display();
        list.displayRev();
    }
}
