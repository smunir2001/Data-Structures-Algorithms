public class LLStackNode {

    BTNode node;
    LLStackNode next;

    public LLStackNode(BTNode node, LLStackNode next) {
        this.node = node;
        this.next = next;
    }

    public void setNode(BTNode node) {
        this.node = node;
    }

    public BTNode getNode() {
        return this.node;
    }

    public void setNext(LLStackNode next) {
        this.next = next;
    }

    public LLStackNode getNext() {
        return this.next;
    }
}
