/*
    StaticArrayDS.java
    - Static array data structure & algorithm implementation.
*/

public class StaticArrayDS {
    int[] mainArray = null;
    int tailPointer = -1;

    public StaticArrayDS(int inputLength) {
        if (inputLength <= 0) {
            System.out.println("ERROR: Cannot initialize mainArray[] with inputLength = " + inputLength + ".");
        } else {
            System.out.println("SUCCESS: Initializing mainArray[] to length = " + inputLength + ".");
            mainArray = new int[inputLength];
            tailPointer++;
        }
    }

    public void insertAtHead(int data) {
        if (mainArray == null || tailPointer == -1) {
            System.out.println("\nERROR: Cannot insertAtHead(" + data + ") in uninitialized/null mainArray[].");
        } else {
            if (tailPointer == mainArray.length) {
                System.out.println("\nERROR: Cannot insertAtHead(" + data + ") in full capacity mainArray[].");
            } else {
                System.out.println("\nSUCCESS: insertingAtHead(" + data + ") in mainArray[].");
                mainArray = shiftRight(mainArray, tailPointer);
                mainArray[0] = data;
                tailPointer++;
            }
        }
    }

    public void removeFromHead() {
        if (mainArray == null || tailPointer == -1) {
            System.out.println("\nERROR: Cannot removeFromHead() from uninitialized/null mainArray[].");
        } else {
            System.out.println("\nSUCCESS: removingFromHead(" + mainArray[0] + ") from mainArray[].");
            shiftLeft(mainArray, tailPointer);
            tailPointer--;
        }
    }

    public void insertAtTail(int data) {
        if (mainArray == null || tailPointer == -1) {
            System.out.println("\nERROR: Cannot insertAtTail(" + data + ") in uninitialized/null mainArray[].");
        } else {
            if (tailPointer == mainArray.length) {
                System.out.println("\nERROR: Cannot insertAtTail(" + data + ") in full capacity mainArray[].");
            } else {
                System.out.println("\nSUCCESS: insertingAtTail(" + data + ") in mainArray[].");
                mainArray[tailPointer] = data;
                tailPointer++;
            }
        }
    }

    public void removeFromTail() {
        if (mainArray == null || tailPointer == -1) {
            System.out.println("\nERROR: Cannot removeFromTail() from uninitialized/null mainArray[].");
        } else {
            if (tailPointer == 0) {
                System.out.println("\nERROR: Cannot removeFromTail() from empty mainArray[].");
                return;
            }
            System.out.println("\nSUCCESS: removingFromTail(" + mainArray[tailPointer - 1] + ") from mainArray[].");
            mainArray[tailPointer - 1] = 0;
            tailPointer--;
        }
    }

    private int[] shiftRight(int[] inputArray, int tailPointer) {
        if (tailPointer == 1) {
            inputArray[1] = inputArray[0];
            inputArray[0] = 0;
            return inputArray;
        } else {
            for (int i = tailPointer; i >= 1; i--) {
                inputArray[i] = inputArray[i - 1];
            }
            return inputArray;
        }
    }

    private int[] shiftLeft(int[] inputArray, int tailPointer) {
        for (int i = 0; i < tailPointer - 1; i++) {
            inputArray[i] = inputArray[i + 1];
        }
        inputArray[tailPointer - 1] = 0;
        return inputArray;
    }

    public void printArray() {
        if (mainArray == null || tailPointer == -1) {
            System.out.println("mainArray[]: []");
        } else {
            System.out.print("mainArray[]: [");
            for (int i = 0; i < mainArray.length; i++) {
                System.out.print(mainArray[i] + ", ");
            }
            System.out.print("\b\b]\n");
        }
    }
}