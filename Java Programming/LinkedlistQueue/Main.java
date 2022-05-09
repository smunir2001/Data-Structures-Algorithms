
public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedlistQueue.java");
        System.out.println("--------------------\n");
        
        LinkedlistQueueDS llQ1 = new LinkedlistQueueDS();
        llQ1.printLinkedlistQueue();
        llQ1.enqueue(0);
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.enqueue(1);
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.enqueue(2);
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.enqueue(3);
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.dequeue();
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.dequeue();
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.dequeue();
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.dequeue();
        llQ1.printLinkedlistQueue();
        llQ1.peek();
        llQ1.dequeue(); // this will report an ERROR
        llQ1.printLinkedlistQueue();
        llQ1.peek(); // this will report an ERROR
    }
}
