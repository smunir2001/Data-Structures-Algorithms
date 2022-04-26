/*
    BubbleSort.java
    - Bubble sort algorithm on arrays.
*/
import java.util.Arrays;
public class BubbleSort {
    private static void bubbleSort(int[] inputArray) {
        System.out.println("SUCCESS: bubbleSort()...");
        for (int i = inputArray.length - 1; i > 1; i--) {
            for (int j = 0; j < i; j++) {
                if (inputArray[j] > inputArray[j + 1]) {
                    swapValues(inputArray, j, j + 1);
                }
            }
        }
    }

    private static void swapValues(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }
    public static void main(String[] args) {
        int[] array1 = {3, 22, 7, 81, 146, 59};
        System.out.println("\narray1[] --> " + Arrays.toString(array1));
        bubbleSort(array1);
        System.out.println("bubbleSort(array1) --> " + Arrays.toString(array1));

        int[] array2 = {3, 7, 22};
        System.out.println("\narray2[] --> " + Arrays.toString(array2));
        bubbleSort(array2);
        System.out.println("bubbleSort(array2) --> " + Arrays.toString(array2));
        System.out.println();
    }
}