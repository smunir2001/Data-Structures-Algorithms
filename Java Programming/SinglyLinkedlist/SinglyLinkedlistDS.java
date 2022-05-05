/*
    SinglyLinkedlistDS.java
    - Singly linkedlist data structure & algorithm implementation.
*/

public class SinglyLinkedlistDS {

    SinglyLLNode head = null;

    public SinglyLinkedlistDS() {
        System.out.println("Initializing SinglyLinkedlistDS object.");
    }

    public void insertAtHead(int data) {
        System.out.println("\nSUCCESS: insertingAtHead(" + data + ") in singly linkedlist.");
        if (head == null) {
            head = new SinglyLLNode(data, null);
        } else {
            SinglyLLNode newHead = new SinglyLLNode(data, head);
            head = newHead;
        }
    }

    public void removeFromHead() {
        if (head == null) {
            System.out.println("\nERROR: cannot removeFromHead() from empty singly linkedlist.");
        } else {
            System.out.println("\nSUCCESS: removingFromHead(" + head.getData() + ") from singly linkedlist.");
            head = head.getNext();
        }
    }

    public void insertAtTail(int data) {
        System.out.println("\nSUCCESS: insertingAtTail(" + data + ") in singly linkedlist.");
        if (head == null) {
            head = new SinglyLLNode(data, null);
        } else {
            SinglyLLNode currentNode = head;
            while (currentNode != null && currentNode.getNext() != null) {
                currentNode = currentNode.getNext();
            }
            SinglyLLNode newNode = new SinglyLLNode(data, null);
            currentNode.setNext(newNode);
        }
    }

    public void removeFromTail() {
        if (head == null) {
            System.out.println("\nERROR: cannot removeFromTail() from empty singly linkedlist.");
        } else if (head != null && head.getNext() == null) {
            System.out.println("\nSUCCESS: removingFromTail(" + head.getData() + ") from singly linkedlist.");
            head = null;
        } else {
            SinglyLLNode currentNode = head;
            while (currentNode != null && currentNode.getNext().getNext() != null) {
                currentNode = currentNode.getNext();
            }
            System.out.println("\nSUCCESS: removingFromTail(" + currentNode.getNext().getData() + ") from singly linkedlist.");
            currentNode.setNext(null);
        }
    }

    public void printSinglyLinkedlist() {
        if (head == null) {
            System.out.println("SinglyLinkedlist: HEAD -> NULL");
        } else {
            System.out.print("SinglyLinkedlist: HEAD -> ");
            SinglyLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("NULL");
        }
    }
}
