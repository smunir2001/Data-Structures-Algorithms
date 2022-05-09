
public class ArrayQueueDS {

    int[] mainQueue = null;
    int front = -1;

    public ArrayQueueDS() {
        System.out.println("\nSuccessful initialization of mainQueue.");
    }

    public void enqueue(int data) {
        System.out.println("\nSUCCESS: enqueue(" + data + ") into mainQueue.");
        if (mainQueue == null) {
            mainQueue = new int[1];
            front++;
            mainQueue[front] = data;
        } else {
            int[] tempArrayQueue = new int[mainQueue.length + 1];
            for (int i = 0; i < mainQueue.length; i++) {
                tempArrayQueue[i] = mainQueue[i];
            }
            front++;
            tempArrayQueue[front] = data;
            mainQueue = tempArrayQueue;
        }
    }

    public void peek() {
        if (mainQueue == null) {
            System.out.println("ERROR: cannot peek() front of queue.");
        } else {
            System.out.println("SUCCESS: mainQueue.peek() --> " + mainQueue[0]);
        }
    }

    public void dequeue() {
        if (mainQueue == null) {
            System.out.println("\nERROR: cannot dequeue() from empty/null mainQueue.");
        } else {
            System.out.println("\nSUCCESS: dequeue(" + mainQueue[0] + ") from mainQueue.");
            if (front == 0) {
                mainQueue = null;
                front = -1;
            } else {
                int[] tempArrayQueue = new int[mainQueue.length - 1];
                for (int i = 0; i < mainQueue.length - 1; i++) {
                    tempArrayQueue[i] = mainQueue[i + 1];
                }
                front--;
                mainQueue = tempArrayQueue;
            }
        }
    }

    public void printArrayQueue() {
        if (mainQueue == null) {
            System.out.println("mainQueue: []");
        } else {
            System.out.print("mainQueue: [");
            for (int i = 0; i < mainQueue.length; i++) {
                System.out.print(mainQueue[i] + ", ");
            }
            System.out.println("\b\b]");
        }
    }
}