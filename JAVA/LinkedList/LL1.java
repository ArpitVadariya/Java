class LL1 {
    Node head;
    public class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }
    public void addFirst(String data) {
    Node newNode = new Node(data);
    if(head == null){
        head = newNode;
        return;
    }
    newNode.next = head;
    head = newNode;
    }
    public void printList() {
        Node currNode = head;
        while(currNode != null) {
            System.out.print(currNode.data+" -> ");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    public void iterateReverse(){
        if(head == null || head.next == null) {
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;
        while(currNode != null) {
            Node nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    
    public static void main(String args[]) {
    LL1 list = new LL1();
    list.printList();
    list.addFirst("1");
    list.addFirst("2");
    list.addFirst("3");
    list.addFirst("4");
    list.addFirst("5");
    list.addFirst("6");
    list.addFirst("7");
    list.printList();

    list.iterateReverse();

    list.printList();
    }
}