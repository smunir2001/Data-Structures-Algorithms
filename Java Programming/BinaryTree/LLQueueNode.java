public class LLQueueNode {

    BTNode node;
    LLQueueNode next;
    LLQueueNode prev;

    public LLQueueNode(BTNode node, LLQueueNode next, LLQueueNode prev) {
        this.node = node;
        this.next = next;
        this.prev = prev;
    }

    public void setNode(BTNode node) {
        this.node = node;
    }

    public BTNode getNode() {
        return this.node;
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