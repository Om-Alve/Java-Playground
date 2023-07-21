package DoublyLinkedList;

public class DLL {
    private Node head;
    private Node tail;

    private int size = 0;

    public void insertFirst(int value){
        if(tail==null){
            head = new Node(value);
            tail = head;
            size++;
            return;
        }
        Node node = new Node(value,head,null);
        head.prev = node;
        head = node;
        size++;
    }
    public void add(int value){
        if(tail == null){
            insertFirst(value);
            return;
        }
        Node node = new Node(value,null,tail);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int index,int value){
        if(index==0){
            insertFirst(value);
        }
        if(index==size){
            add(value);
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        Node element = new Node(value,node.next,node);
        if(node.next!=null){
        node.next.prev = element;
        }else {
            tail = element;
        }
        node.next = element;
        size++;
    }

    private void insertLast(int value) {
        Node node = new Node(value,null,tail);
        tail.next = node;
        tail = node;
        size++;
    }

    public void display(){
        Node node = head;
        for (int i = 0; i < size; i++) {
            System.out.print(node.value+ "->");
            node=node.next;
        }
        System.out.println("END");
    }
    public void displayRev(){
        Node node = tail;
        while(node!=null){
            System.out.print(node.value + "->");
            node = node.prev;
        }
        System.out.println("END");
    }
    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }

        public Node(int value, Node next, Node prev) {
            this.value = value;
            this.next = next;
            this.prev = prev;
        }
    }
}
