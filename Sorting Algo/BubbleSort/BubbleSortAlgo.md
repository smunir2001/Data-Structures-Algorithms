# Bubble Sort (Java Implementation)
## Overview
* ### The bubble sort algorithm bubbles up pairs of two adjacent elements and swaps them depending on ascending/descending order.

## *private static void bubbleSort(int[] inputArray)*
```Java
private static void bubbleSort(int[] inputArray) {
    for (int i = inputArray.length - 1; i > 1; i--) {
        for (int j = 0; j < i; j++) {
            if (inputArray[j] > inputArray[j + 1]) {
                swapValues(inputArray, j, j + 1);
            }
        }
    }
}
```

## *private static void swapValues(int[] inputArray, int index1, int index2)*
```Java
private static void swapValues(int[] inputArray, int index1, int index2) {
    int temp = inputArray[index1];
    inputArray[index1] = inputArray[index2];
    inputArray[index2] = temp;
}
```

## Time complexity
### Quadratic-time complexity O(n^2)
* ### Best-case time complexity
    * The best case time complexity would be when the array is already sorted which would result in a __linear-time O(n)__ operation because we would traverse the inputArray[] taking two elements at a time and seeing if they're in the correct position.
* ### Average-case time complexity
    * The average case time complexity would be __O(n^2)__ when the array is partially sorted and we would still need to swap pairs of adjacent elements that are incorrectly ordered, resulting in a __quadratic-time operation__.
* ### Worst-case time complexity
    * The worst case time complexity would be __O(n^2)__ when the array is reverse-sorted and we would have to swap all pairs of adjacent elements that are incorrectly ordered, resulting in a __quadratic-time operation__.