# Insertion Sort (Java Implementation)
## Overview
* ### The insertion sort algorithm is a simple algorithm that works similar to the way you sort playing cards in your hands. The array is virtually split into a sorted and an unsorted part. Values from the unsorted part are picked and palced at the correct position in the sorted part.
* ### Algorithm:
    * Iterate from inputArray[1] to inputArray[n] over the inputArray[].
    * Compare the current element (key) to its predecessor.
    * If the key element is smaller than its predecessor, compare it to the elements before. Move the greater elements one position up to make space for the swapped element.

## *private static void insertionSort(int[] inputArray)*
```Java
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
```

## Time complexity
### Quadratic-time complexity O(n^2)
* Best-case time complexity
    * The best-case time complexity would be __linear-time O(n)__ when the inputArra[] is already sorted.
* Average-case time complexity
    * The average-case time complexity would be __quadratic-time O(n^2)__ when the inputArray[] is partially sorted and requires chekcing the position of each element and shifting them accordingly.
* Worst-case time complexity
    * The worst-case time complexity would be __quadratic-time O(n^2)__ when the inputArray[] is reverse-sorted and would require checking all elements and shifting all elements from the unsorted region to the sorted region.