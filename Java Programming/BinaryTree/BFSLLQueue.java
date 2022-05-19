public class BFSLLQueue {

    LLQueueNode head = null;
    LLQueueNode tail = null;
    int size = 0;

    public void enqueue(BTNode node) {
        if (head == null) {
            head = new LLQueueNode(node, null, null);
            tail = head;
            size = 1;
        } else {
            LLQueueNode newQNode = new LLQueueNode(node, null, tail);
            tail.setNext(newQNode);
            tail = tail.getNext();
            size++;
        }
    }

    public LLQueueNode dequeue() {
        if (head == null) {
            return null;
        } else {
            LLQueueNode poppedNode;
            if (head.getNext() == null) {
                poppedNode = head;
                head = null;
                tail = null;
                size = 0;
                return poppedNode;
            } else {
                poppedNode = head;
                head = head.getNext();
                head.setPrev(null);
                return poppedNode;
            }
        }
    }

    public boolean isEmpty() {
        if (head == null) {
            return true;
        } else {
            return false;
        }
    }
}