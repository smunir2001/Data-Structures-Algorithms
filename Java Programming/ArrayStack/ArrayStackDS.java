public class ArrayStackDS {

    int[] mainStack = null;
    int top = -1;

    public ArrayStackDS() {
        System.out.println("Successful initialization of array stack object.");
    }

    public void push(int data) {
        System.out.println("\nSUCCESS: pushing(" + data + ") into array stack.");
        if (mainStack == null) {
            mainStack = new int[1];
            top = 0;
            mainStack[top] = data;
        } else {
            if (top == 0) {
                int[] tempStack = new int[mainStack.length + 1];
                tempStack[top] = mainStack[top];
                top++;
                tempStack[top] = data;
                mainStack = tempStack;
            } else {
                int[] tempStack = new int[mainStack.length + 1];
                for (int i = 0; i < mainStack.length; i++) {
                    tempStack[i] = mainStack[i];
                }
                top++;
                tempStack[top] = data;
                mainStack = tempStack;
            }
        }
    }

    public void peek() {
        if (mainStack == null) {
            System.out.println("\nERROR: cannot peek from empty array stack.");
        } else {
            System.out.println("\nmainStack.peek() --> " + mainStack[top]);
        }
    }

    public void pop() {
        if (mainStack == null) {
            System.out.println("\nERROR: cannot pop() from empty array stack.");
        } else {
            System.out.println("\nSUCCESS: popping(" + mainStack[top] + ") from array stack.");
            if (top == 0) {
                mainStack = null;
                top--;
            } else {
                int[] tempStack = new int[mainStack.length - 1];
                for (int i = 0; i < tempStack.length; i++) {
                    tempStack[i] = mainStack[i];
                }
                top--;
                mainStack = tempStack;
            }
        }
    }

    public void printArrayStack() {
        if (top == -1) {
            System.out.println("TOP\n----");
            System.out.println("----");
        } else {
            System.out.println("TOP\n----");
            for (int i = mainStack.length - 1; i >= 0; i--) {
                System.out.println(mainStack[i]);
            }
            System.out.println("----");
        }
    }
}
