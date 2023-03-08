package arnab.DSA.LinkedList;

public class CreatingLL {
    Node head;

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data) {
        Node newnoNode = new Node(data);
        if (head == null) {
            head = newnoNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnoNode;
        currNode = newnoNode;
    }

    public void printList() {
        if (head == null)
            System.out.println("List is empty");

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("null");
    }

    public static void main(String[] args) {
        CreatingLL list = new CreatingLL();
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        list.printList();
        System.out.println(" ");
        list.addLast("List");
        list.printList();
    }

}
