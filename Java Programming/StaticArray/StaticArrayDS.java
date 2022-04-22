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

    public void printArray() {
        if (mainArray == null) {
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