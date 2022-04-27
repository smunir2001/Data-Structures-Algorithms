# Selection Sort (Java Implementation)
## Overview
* ### The selection sort algorithm sorts an array by repeatedly finding the minimum element (considering ascending order) from unsorted part and putting it at the beginning. The algorithm maintains two subarrays in a given array.
    * The subarray which is already sorted.
    * The remaining subarray which is unsorted.
* ### In every iteration of selection sort, the minimum element (considering ascending order) from the unsorted subarray is picked and moved to the sorted subarray.

## *private static void selectionSort(int[] inputArray)*
```Java
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
    * The best-case time complexity would be when the inputArray is already sorted resulting in an __O(1) constant-time__ operation.
* ### Average-case time complexity
    * The average-case time complexity would be when the inputArray is partially sorted and requires elements to be rearranged into the *sorted* region and because we have two nested for-loops, we will encounter an __O(n^2) quadratic-time__ operation.
* ### Worst-case time complexity
    * The worst-case time complexity would be when the inputArray[] is reverse-sorted and would require all elements to be rearranged from the unsorted region into the sorted region. Due to nested for-loops and the concept of moving the subsequent minimum element into the sorted region of the inputArray, resulting in an __O(n^2) quadratic-time__ operation.