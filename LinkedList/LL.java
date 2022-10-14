package LinkedList;

public class LL {
    static class Node{
        int data;
        Node next;
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    static Node head = null;
    public static void add(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newNode;
    }
    public static void printList(){
        if(head == null){
            System.out.println("Empty List!!!");
            return;
        }
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println(temp.data);
    }
    public static void deleteNode(int n) {
        if (head == null) {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next.data != n){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void insert(int prev,int val){
        Node newNode = new Node(val);
        if(prev == head.data){
            newNode.next = head.next;
            head.next = newNode;
            return;
        }
        Node temp = head;
        while(temp.next.data != prev){
            temp = temp.next;
        }
        Node prevNode = temp.next;
        prevNode.next = newNode;
        newNode.next = temp.next.next;
    }
    public static void main(String[] args) {
        add(1);
        add(2);
        add(3);
        add(4);
        add(5);
        printList();
        deleteNode(4);
        printList();
        insert(3,7);
        printList();
    }


}
