import java.util.*;

public class LLR {
    Node head;
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data = data;
            this.next = null;
        }
    }    
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    public void removeFirst(){
        if(head == null){
            System.out.println("Linked List is Empty.");
        }
        Node curNode = head;
        head = head.next;
    }
    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    public void removeLast(){
        if(head == null){
            System.out.println("Linked List is Empty.");
        }
        if(head.next == null){
            head = null;
        }
        Node currNode = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            currNode = currNode.next;
            lastNode = lastNode.next;
        }
        currNode.next = null;
    }
    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        LLR list = new LLR();
        Scanner sc = new Scanner(System.in);
        list.addLast(sc.nextLine());
        list.addLast(sc.nextLine());
        list.addLast(sc.nextLine());
        list.addLast(sc.nextLine());
        list.addLast(sc.nextLine());
        list.addLast(sc.nextLine());
        list.addLast(sc.nextLine());
        list.addLast(sc.nextLine());
        list.printList();
        System.out.println("remove first");
        list.removeFirst();
        list.printList();
        System.out.println("Remove last");
        list.removeLast();
        list.printList();
    }
    public void removeNthNodeEnd() {
    }
}