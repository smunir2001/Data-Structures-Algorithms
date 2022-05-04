/*
    SinglyLLNode.java
    - Singly linkedlist node class to represent, create, and store each node in a linkedlist.
*/

public class SinglyLLNode {

    int data;
    SinglyLLNode next;

    public SinglyLLNode(int data) {
        this.data = data;
    }

    public SinglyLLNode(SinglyLLNode next) {
        this.next = next;
    }

    public SinglyLLNode(int data, SinglyLLNode next) {
        this.data = data;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(SinglyLLNode next) {
        this.next = next;
    }

    public SinglyLLNode getNext() {
        return this.next;
    }
}
