/*
    DoublyLinkedlistDS.java
    - Doubly linkedlist data structure & algorithm implementation.
*/

public class DoublyLinkedlistDS {

    DoublyLLNode head = null;
    DoublyLLNode tail = null;

    public int getHeadData() {
        if (head == null) {
            return -1;
        }
        return head.data;
    }

    public int getTailData() {
        if (tail == null) {
            return -1;
        }
        return tail.data;
    }

    public DoublyLinkedlistDS() {
        System.out.println("Initializing DoublyLinkedlistDS object.");
    }

    public void insertAtHead(int data) {
        System.out.println("\nSUCCESS: insertingAtHead(" + data + ") in doubly linkedlist.");
        if (head == null) {
            head = new DoublyLLNode(data, null, null);
            tail = head;
        } else {
            DoublyLLNode newHead = new DoublyLLNode(data, head, null);
            head.setPrevious(newHead);
            head = newHead;
        }
    }

    public void removeFromHead() {
        if (head == null) {
            System.out.println("\nERROR: cannot removeFromHead() from empty doubly linkedlist.");
        } else {
            System.out.println("\nSUCCESS: removingFromHead(" + head.getData() + ") from singly linkedlist.");
            if (head.getNext() == null) {
                head = null;
                tail = null;
            } else {
                head.getNext().setPrevious(null);
                head = head.getNext();
            }
        }
    }

    public void insertAtTail(int data) {
        System.out.println("\nSUCCESS: insertingAtTail(" + data + ") in doubly linkedlist.");
        if (head == null) {
            head = new DoublyLLNode(data, null, null);
            tail = head;
        } else {
            DoublyLLNode newNode = new DoublyLLNode(data, null, tail);
            tail.setNext(newNode);
            tail = tail.getNext();
        }
    }

    // public void removeFromTail() {
    //     if (head == null) {
    //         System.out.println("\nERROR: cannot removeFromTail() from empty doubly linkedlist.");
    //     } else {
    //         System.out.println("\nSUCCESS: removingFromTail(" + tail.getData() + ") from doubly linkedlist.");
    //         if (tail.getPrevious() == null) {
    //             head.setNext(null);
    //         } else {
    //             tail = tail.getPrevious();
    //             tail.setNext(null);
    //         }
    //     }
    // }

    public void removeFromTail() {
        if (head == null) {
            System.out.println("\nERROR: cannot removeFromTail() from empty doubly linkedlist.");
        } else {
            System.out.println("\nSUCCESS: removingFromTail(" + tail.getData() + ") from doubly linkedlist.");
            if (tail.getPrevious() == null) {
                head = null;
                tail = null;
            } else {
                tail.getPrevious().setNext(null);
                tail = tail.getPrevious();
            }
        }
    }

    public void printDoublyLinkedlist() {
        if (head == null) {
            System.out.println("DoublyLinkedlist: HEAD -> NULL");
        } else {
            System.out.print("DoublyLinkedlist: HEAD -> ");
            DoublyLLNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("NULL");
        }
    }
    
}