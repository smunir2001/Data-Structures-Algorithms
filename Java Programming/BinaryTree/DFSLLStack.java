public class DFSLLStack {

    LLStackNode head = null;

    public void push(BTNode node) {
        if (head == null) {
            head = new LLStackNode(node, null);
        } else {
            LLStackNode newHead = new LLStackNode(node, head);
            head = newHead;
        }
    }

    public LLStackNode pop() {
        if (head == null) {
            return null;
        } else {
            LLStackNode poppedNode;
            if (head.getNext() == null) {
                poppedNode = head;
                head = null;
                return poppedNode;
            } else {
                poppedNode = head;
                head = head.getNext();
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
