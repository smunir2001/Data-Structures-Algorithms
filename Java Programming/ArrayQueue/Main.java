
public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayQueue.java");
        System.out.println("---------------\n");

        ArrayQueueDS aQ1 = new ArrayQueueDS();
        aQ1.printArrayQueue();
        aQ1.enqueue(0);
        aQ1.printArrayQueue();
        aQ1.enqueue(1);
        aQ1.printArrayQueue();
        aQ1.enqueue(2);
        aQ1.printArrayQueue();
        aQ1.enqueue(3);
        aQ1.printArrayQueue();
        aQ1.peek();
        aQ1.dequeue();
        aQ1.printArrayQueue();
        aQ1.peek();
        aQ1.dequeue();
        aQ1.printArrayQueue();
        aQ1.peek();
        aQ1.dequeue();
        aQ1.printArrayQueue();
        aQ1.peek();
        aQ1.dequeue();
        aQ1.printArrayQueue();
        aQ1.peek();
    }
}
