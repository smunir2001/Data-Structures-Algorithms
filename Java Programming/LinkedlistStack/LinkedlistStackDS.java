public class LinkedlistStackDS {

    LLStackNode head = null;

    public LinkedlistStackDS() {
        System.out.println("\nSuccessful initialization of linkedlist stack.");
    }

    public void push(int data) {
        System.out.println("\nSUCCESS: pushing(" + data + ") into linkedlist stack.");
        if (head == null) {
            head = new LLStackNode(data, null);
        } else {
            LLStackNode newHead = new LLStackNode(data, head);
            head = newHead;
        }
    }

    public void peek() {
        if (head == null) {
            System.out.println("\nERROR: cannot peek from linkedlist stack.");
        } else {
            System.out.println("SUCCESS: head.peek() -> " + head.data);
        }
    }

    public void pop() {
        if (head == null) {
            System.out.println("\nERROR: cannot pop() from empty linkedlist stack.");
        } else {
            System.out.println("\nSUCCESS: popping(" + head.data + ") from linkedlist stack.");
            if (head.getNext() == null) {
                head = null;
            } else {
                head = head.getNext();
            }
        }
    }

    public void printLinkedlistStack() {
        if (head == null) {
            System.out.println("HEAD\n----");
            System.out.println("xxxx");
            System.out.println("----\nNULL");
        } else {
            System.out.println("HEAD\n----");
            LLStackNode currentNode = head;
            while (currentNode != null) {
                System.out.println(currentNode.getData());
                currentNode = currentNode.getNext();
            }
            System.out.println("----\nNULL");
        }
    }
}
