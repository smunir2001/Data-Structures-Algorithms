/*
    SelectionSort.java
    - Selection sort algorithm on arrays.
*/
import java.util.Arrays;
public class InsertionSort {
    private static void insertionSort(int[] inputArray) {
        for (int i = 1; i < inputArray.length; i++) {
            int j = i;
            int toInsert = inputArray[i];
            while ((j > 0) && (inputArray[j - 1] > toInsert)) {
                inputArray[j] = inputArray[j - 1];
                j--;
            }
            inputArray[j] = toInsert;
        }
    }
    public static void main(String[] args) {
        int[] array1 = {3, 22, 7, 81, 146, 59};
        System.out.println("array1[] --> " + Arrays.toString(array1));
        insertionSort(array1);
        System.out.println("insertionSort(array1) --> " + Arrays.toString(array1));
    }
}
