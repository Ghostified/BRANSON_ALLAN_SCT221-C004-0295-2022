class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    // Constructor for SinglyLinkedListNode
    public SinglyLinkedListNode(int data) {
        this.data = data;
    }
}

public class SinglyLinkedListInsertion {

    // Function to insert a node at a specified position in the linked list
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        // Create a new node with the given data
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        // Insert at the beginning if position is 0
        if (position == 0) {
            newNode.next = head;
            return newNode;
        }

        // Traverse to the node at the specified position
        SinglyLinkedListNode current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }

        // Insert the new node at the specified position
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    // Function to print the elements of the linked list
    static void printLinkedList(SinglyLinkedListNode head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println(); // Move to the next line after printing the list
    }

    // Main Method to test the insertNodeAtPosition function
    public static void main(String[] args) {
        // Create a linked list with initial values
        SinglyLinkedListNode head = new SinglyLinkedListNode(3);
        head.next = new SinglyLinkedListNode(4);
        head.next.next = new SinglyLinkedListNode(7);

        // Print the initial linked list
        System.out.print("Initial Linked List: ");
        printLinkedList(head); // Output: 3 4 7

        // Insert a new node at position 1 with data 5
        SinglyLinkedListNode newHead = insertNodeAtPosition(head, 5, 1);

        // Print the updated linked list
        System.out.print("Updated Linked List: ");
        printLinkedList(newHead); // Output: 3 5 4 7
    }
}
