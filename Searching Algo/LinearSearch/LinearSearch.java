/*
    LinearSearch.java
    - Linear search algorithm on arrays.
*/
import java.util.Arrays;
public class LinearSearch {
    private static void linearSearch(int[] inputArray, int target) {
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] == target) {
                System.out.println("\nSUCCESS: linearSearch() found " + target + " in inputArray[].");
                return;
            }
        }
        System.out.println("\nERROR: linearSearch() did not find " + target + " in inputArray[].");
    }
    public static void main(String[] args) {
        int[] array1 = {3, 22, 7, 81, 146, -59};
        System.out.println("array1[] --> " + Arrays.toString(array1));
        linearSearch(array1, 81);
        linearSearch(array1, 53);
    }
}