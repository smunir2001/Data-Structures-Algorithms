public class LLStackNode {

    int data;
    LLStackNode next;

    public LLStackNode(int data, LLStackNode next) {
        this.data = data;
        this.next = next;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNext(LLStackNode next) {
        this.next = next;
    }

    public LLStackNode getNext() {
        return this.next;
    }
}
