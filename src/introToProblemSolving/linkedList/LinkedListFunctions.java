package introToProblemSolving.linkedList;

public class LinkedListFunctions {
    public static void main(String[] args) {

        // Creating Linked List

        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node head = n1;

        n1.next = n2;  // data , next
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        // create Node
        // create LL
        // create LL by taking inputs from user
        // print LL
        printLinkedList(head);
        // length
        // insert at beg
        // insert at end
        // insert at any index
        // delete  at beg
        // delete from last
        // delete at any index
        // reverse
        // mid
        // cycle detect

        head =  insertNodeAtBegin(head, 100);

        printLinkedList(head);

        head = insertAtEnd(head,100);

        printLinkedList(head);

        head = insertAtIndex(head,3,100);

        printLinkedList(head);
    }

    public static void printLinkedList(Node head){

        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node insertNodeAtBegin(Node head,int data){
        Node newNode = new Node(data);

        newNode.next = head;
        return  newNode;
        //printLinkedList(head);
    }

    public static Node insertAtEnd(Node head,int data){
        Node newNode = new Node(data);

        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }

        temp.next = newNode;

        return head;
    }

    public static Node insertAtIndex(Node head, int k, int data) {
        Node newNode = new Node(data);

        // If inserting at the head
        if (k == 0) {
            newNode.next = head;
            return newNode; // New node becomes the new head
        }

        Node temp = head;
        int countIndex = 0;

        // Traverse to the (k-1)th node
        while (temp != null && countIndex < k - 1) {
            temp = temp.next;
            countIndex++;
        }

        // If k is out of bounds
        if (temp == null) {
            System.out.println("Index out of bounds");
            return head; // Return original head without insertion
        }

        // Insert new node
        newNode.next = temp.next;
        temp.next = newNode;

        return head;
    }


}
