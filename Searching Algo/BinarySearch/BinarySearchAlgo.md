# Binary Search (Java Implementation)
## Overview
* ### The binary search algorithm __only works__ on a __sorted__ array in __ascending order__. It takes two pointers left and right which are initialized to left = 0 and right = inputArray.length - 1. The idea is to start checking the element at the middle position in the sorted inputArray[] and check if it is equal to the target element. 
    * If yes, then return true and the target element has been found. 
    * If the target is less than the element at the middle position in the inputArray[], then the target must be located to the left of the middle element and we will split the array and search the region to the left of the middle element. 
    * If the target is greater than the element, then the target must be located to the right of the middle element and we will split the array and search the region to the right of the middle pointer. 
### Therefore, our left and right pointers will shift/move accordingly and divide our respective search region of inputArray[] into half each time until we are left with a single element array.

## *private static boolean binarySearch(int[] inputArray, int target)*
```Java
private static boolean binarySearch(int[] inputArray, int target) {
    int left = 0;
    int right = inputArray.length - 1;
    while (left <= right) {
        int mid = left + ((right - left) / 2);
        if (inputArray[mid] == target) {
            return true;
        } else if (target < inputArray[mid]) {
            right = mid - 1;
        } else {
            left = mid + 1;
        }
    }
    return false;
}
```

## *private static boolean binarySearchRecursive(int[] inputArray, int target, int left, int right)*
```Java
private static boolean binarySearchRecursive(int[] inputArray, int target, int left, int right) {
    if (left > right) {
        return false;
    }
    int mid = left + ((right - left) / 2);
    if (inputArray[mid] == target) {
        return true;
    } else if (target < inputArray[mid]) {
        return binarySearchRecursive(inputArray, target, left, mid - 1);
    } else {
        return binarySearchRecursive(inputArray, target, mid + 1, right);
    }
}
```

## Time complexity
### Logarithmic-time complexity O(logn)
* ### Best-case time complexity
    * The best case time complexity would be O(1) if the target element is in the middle of the inputArray[] and no splitting required would result in a constant-time operation.
* ### Average-case time complexity
    * The average case time complexity would be O(logn) when the target element is located somwhere in the middle of the inputArray[]. This would require splitting the inputArray[] into half and depending on if the element at the new middle position in inputArray[] is equal to the target. Splitting the inputArray[] into half each time we search the element at the middle location is a logarithmic operation.
* ### Worst-case time complexity
    * The worst case time complexity would be O(logn) when we have exhausted our binary search by splitting the size n of inpurArray[] in half until we have one element left and still have not been able to find the target element. Splitting the inputArray[] into half each time we search the element at the middle location is a logarithmic operation.