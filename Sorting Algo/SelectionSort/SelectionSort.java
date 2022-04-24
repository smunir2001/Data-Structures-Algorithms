/*
    SelectionSort.java
    - Selection sort algorithm on arrays.
*/
import java.util.Arrays;
public class SelectionSort {
    private static void selectionSort(int[] inputArray) {
        for (int i = 0; i < inputArray.length; i++) {
            int minimum = i;
            for (int j = i; j < inputArray.length; j++) {
                if (inputArray[minimum] > inputArray[j]) {
                    minimum = j;
                }
            }
            swapValues(inputArray, i, minimum);
        }
    }

    private static void swapValues(int[] inputArray, int index1, int index2) {
        int temp = inputArray[index1];
        inputArray[index1] = inputArray[index2];
        inputArray[index2] = temp;
    }
    public static void main(String[] args) {
        int[] array1 = {3, 22, 7, 81, 146, 59};
        System.out.println("array1[] --> " + Arrays.toString(array1));
        selectionSort(array1);
        System.out.println("selectionSort(array1) --> " + Arrays.toString(array1));
    }
}