package LinkedLists;

public class LL{
    private Node head;
    private Node tail;
    private int size;
    public LL(){
        this.size=0;
    }

    public Node getHead() {
        return head;
    }

    public void insertFirst(int value){
        Node node =  new Node(value,this.head);
        this.head = node;
        if(this.tail == null){
            this.tail=this.head;
        }
        size++;

    }
    public void insertLast(int value){
        Node node = new Node(value);
        if(tail==null){
            insertFirst(value);
            return;
        }
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertRec(int index,int value){
        head = insertRec(index,value,head);
    }
    private Node insertRec(int index,int value,Node node){
        if(index==0){
            Node ele = new Node(value,node);
            size++;
            return ele;
        }
        node.next = insertRec(index-1,value,node.next);
        return node;
    }
    public void insert(int index,int value) throws IndexOutOfBoundsException{
        if(index<0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        Node node = head;
        while(index!=0){
            node = node.next;
            index--;
        }
        node.next = new Node(value,node.next);
        size++;
    }

    public void deleteFirst(){
        if(tail == head){
            tail = null;
        }
        head = head.next;
        size--;
    }

    public void deleteLast(){
        Node node = head;
        while(node.next != tail){
            node = node.next;
        }
        node.next = null;
        tail = node;
        size--;
    }

    public void delete(int index) throws IndexOutOfBoundsException{
        if(index>=size){
            throw new IndexOutOfBoundsException();
        }
        if(index==0){
            deleteFirst();
        }
        if(index == size-1){
            deleteLast();
        }
        Node node = head;
        for (int i = 0; i < index - 1; i++) {
            node = node.next;
        }
        node.next = node.next.next;
    }

    public int findIndexOf(int value){
        Node node = head;
        for (int i = 0; i < size; i++) {
            if(node.value == value){
                return i;
            }
            node= node.next;
        }
        return -1;
    }

    public int get(int index) throws IndexOutOfBoundsException{
        if(index>size){
            throw new IndexOutOfBoundsException();
        }
        Node node = head;
        for (int i = 0; i < index; i++) {
            node = node.next;
        }
        return node.value;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
    public void reverse(Node node){
        if(node == tail){
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
    private class Node{
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
