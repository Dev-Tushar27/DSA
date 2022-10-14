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
        if (head.data == n) {
            head = head.next;
            return;
        }
        Node temp = head;
        while(temp.next.data != n){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public static void insert(int pos,int val){
        Node newNode = new Node(val);
        if(pos == 0){
            newNode.next = head;
            head = newNode;
            return;
        }
        Node temp = head;
        int i = 0;
        do{
            i++;
            temp = temp.next;
        }while(i != pos);
        newNode.next = temp.next;
        temp.next = newNode;
    }

}
