import java.util.*;

public class LastNthRemove {
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
    public Node removeNthNodeEnd(int removenode){
        Node temp = head;
        int size = 0;
        // to count size of linkedlist
        while(temp != null){
            temp = temp.next;
            size++;
        }
        if(removenode == size){
            head = head.next;
            return head;
        }
        // to count position which we have to remove from linkedlist
        int posToFind = size - removenode;
        Node prev = head;
        int currpos = 1;
        while(currpos != posToFind){
            prev = prev.next;
            currpos++;
        }
        prev.next = prev.next.next;
        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LastNthRemove list = new LastNthRemove();
        list.addLast("1");
        list.addLast("2");
        list.addLast("3");
        list.addLast("4");
        list.addLast("5");
        list.addLast("6");
        list.addLast("7");

        list.printList();
        System.out.print("Enter node number : ");
        int n = sc.nextInt();
        list.removeNthNodeEnd(n);
        list.printList();

    }
}