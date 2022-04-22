/*
    StaticArrayDS.java
    - Static array data structure & algorithm implementation.
*/

public class StaticArrayDS {
    int[] mainArray = null;
    int tailPointer = -1;

    public StaticArrayDS(int inputLength) {
        if (inputLength <= 0) {
            System.out.println("\nERROR: Cannot initialize mainArray[] with inputLength = " + inputLength + ".");
        } else {
            System.out.println("\nInitializing mainArray[] to length = " + inputLength + ".");
            mainArray = new int[inputLength];
            tailPointer++;
        }
    }
}