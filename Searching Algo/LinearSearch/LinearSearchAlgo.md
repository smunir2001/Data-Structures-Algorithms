# Linear Search (Java Implementation)
## Overview
* ### The linear search algorithm starts at the first element of the array and sequentially traverses the array until element n - 1 (n = input size/length) and checks if each element is equal to the target element. If we find the target element, then we break out of the loop and return.

## *private static void linearSearch(int[] inputArray, int target)*
```Java
private static void linearSearch(int[] inputArray, int target) {
    for (int i = 0; i < inputArray.length; i++) {
        if (inputArray[i] == target) {
            // SUCCESS: element found!
        }
    }
    // ERROR: element not found!
}
```
* Traverse inputArray[] from index i = 0... n - 1 (inclusive) and check if each element is equal to the target element. If yes, we can save the location (index) in the inputArray[] at which the target element was found or we can also return a "success" message and break out of the loop and return.

## Time complexity
### Linear-time complexity O(n)
* ### Best-case time complexity
    * The best case time complexity would be constant time O(1) when the target element is located at the very beginning (first index) of the inputArray[]. This means that we will not have to traverse the rest of the inputArray[] and the target element will be found in O(1) operation.
* ### Average-case time complexity
    * The average case time complexity would be linear time O(n) when the target element is located within the middle (between first & last index) of the inputArray[]. This means that we will have to traverse up to at most n times in search for the target element.
* ### Worst-case time complexity
    * The worst case time complexity would be linear time O(n) when the target element is located at the very end (last index) of the inputArray[]. This means that we will have to traverse from the beginning (first index) of the inputArray[] up until the last element at (n - 1) which will result it checking at most n elements in search for the target element.