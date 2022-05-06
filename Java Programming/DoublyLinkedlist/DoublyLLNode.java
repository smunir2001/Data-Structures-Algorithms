/*
    DoublyLLNode.java
    - Doubly linkedlist node class to represent, create, and store each node in a linkedlist.
*/

public class DoublyLLNode {

    int data;
    DoublyLLNode next;
    DoublyLLNode previous;

    public DoublyLLNode(int data) {
        this.data = data;
    }

    public DoublyLLNode(DoublyLLNode next) {
        this.next = next;
    }

    public DoublyLLNode(int data, DoublyLLNode next, DoublyLLNode previous) {
        this.data = data;
        this.next = next;
        this.previous = previous;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(DoublyLLNode next) {
        this.next = next;
    }

    public DoublyLLNode getNext() {
        return this.next;
    }

    public void setPrevious(DoublyLLNode previous) {
        this.previous = previous;
    }

    public DoublyLLNode getPrevious() {
        return this.previous;
    }
}
