/*
    BinarySearch.java
    - Binary search algorithm on arrays.
*/
import java.util.Arrays;
public class BinarySearch {
    private static boolean binarySearch(int[] inputArray, int target) {
        int left = 0;
        int right = inputArray.length - 1;
        while (left <= right) {
            int mid = left + ((right - left) / 2);
            if (inputArray[mid] == target) {
                System.out.println("\nSUCCESS: binarySearch(" + target + ") found element in inputArray[].");
                return true;
            } else if (target < inputArray[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        System.out.println("\nERROR: binarySearch(" + target + ") could not find element in inputArray[].");
        return false;
    }
    private static boolean binarySearchRecursive(int[] inputArray, int target, int left, int right) {
        if (left > right) {
            System.out.println("\nERROR: binarySearchRecursive(" + target + ") could not find element in inputArray[].");
            return false;
        }
        int mid = left + ((right - left) / 2);
        if (inputArray[mid] == target) {
            System.out.println("\nSUCCESS: binarySearchRecursive(" + target + ") found element in inputArray[].");
            return true;
        } else if (target < inputArray[mid]) {
            return binarySearchRecursive(inputArray, target, left, mid - 1);
        } else {
            return binarySearchRecursive(inputArray, target, mid + 1, right);
        }
    }
    public static void main(String[] args) {
        int[] array1 = {3, 22, 7, 81, 146, -59};
        Arrays.sort(array1);
        System.out.println("array1[] --> " + Arrays.toString(array1));
        binarySearch(array1, 81);
        binarySearch(array1, 3);
        binarySearch(array1, 53);
        binarySearch(array1, -59);
        binarySearchRecursive(array1, 81, 0, array1.length - 1);
        binarySearchRecursive(array1, 3, 0, array1.length - 1);
        binarySearchRecursive(array1, 53, 0, array1.length - 1);
        binarySearchRecursive(array1, -59, 0, array1.length - 1);
        System.out.println();
    }    
}