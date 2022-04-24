/*
    BinarySearch.java
    - Binary search algorithm on arrays.
*/
import java.util.Arrays;
public class BinarySearch {
    private static void binarySearch(int[] inputArray, int target) {
        int lowIndex = 0;
        int highIndex = inputArray.length - 1;
        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;
            if (inputArray[middleIndex] < target) {
                lowIndex = middleIndex + 1;
            } else if (inputArray[middleIndex] > target) {
                highIndex = middleIndex - 1;
            } else {
                System.out.println("\nSUCCESS: binarySearch() found " + target + " in inputArray[].");
                lowIndex = highIndex + 1;
            }
        }
    }
    public static void main(String[] args) {
        int[] array1 = {3, 22, 7, 81, 146, -59};
        Arrays.sort(array1);
        System.out.println("array1[] --> " + Arrays.toString(array1));
        binarySearch(array1, 81);
    }    
}
