
public class LinkedlistQueueDS {

    LLQueueNode head = null;
    LLQueueNode tail = null;
    int size = 0;

    public LinkedlistQueueDS() {
        System.out.println("Successfully initialized linkedlist queue object.");
    }

    public void enqueue(int data) {
        System.out.println("\nSUCCESS: enqueue(" + data + ") into linkedlist queue.");
        if (head == null) {
            head = new LLQueueNode(data, null, null);
            tail = head;
            size = 1;
        } else {
            LLQueueNode newQNode = new LLQueueNode(data, null, tail);
            tail.setNext(newQNode);
            tail = tail.getNext();
            size++;
        }
    }
    
    public void peek() {
        if (head == null) {
            System.out.println("ERROR: cannot peek() at front of empty/null linkedlist queue.");
        } else {
            System.out.println("SUCCESS: llQ1.peek() -> " + head.getData() + ".");
        }
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("\nERROR: cannot dequeue() from empty/null linkedlist queue.");
        } else {
            System.out.println("\nSUCCESS: dequeue(" + head.getData() + ") from linkedlist queue.");
            if (head.getNext() == null) {
                head = null;
                tail = null;
                size = 0;
            } else {
                head = head.getNext();
                head.setPrev(null);
            }
        }
    }

    public void printLinkedlistQueue() {
        if (head == null) {
            System.out.println("llQ1: FRONT -> REAR");
        } else {
            System.out.print("llQ1: FRONT -> ");
            LLQueueNode currentNode = head;
            while (currentNode != null) {
                System.out.print(currentNode.getData() + " -> ");
                currentNode = currentNode.getNext();
            }
            System.out.println("REAR");
        }
    }
    
}
