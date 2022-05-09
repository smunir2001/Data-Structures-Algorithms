
public class LLQueueNode {

    int data;
    LLQueueNode next;
    LLQueueNode prev;

    public LLQueueNode(int data, LLQueueNode next, LLQueueNode prev) {
        this.data = data;
        this.next = next;
        this.prev = prev;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(LLQueueNode next) {
        this.next = next;
    }

    public LLQueueNode getNext() {
        return this.next;
    }

    public void setPrev(LLQueueNode prev) {
        this.prev = prev;
    }

    public LLQueueNode getPrev() {
        return this.prev;
    }
}
