# Static Array (C Implementation)
## Member variables
* int* mainArray
    * Our program's pointer variable to a global array to be initialized and image static length/size properties.
    * Default value = NULL
    * Full CRUD implementation.
* int tailPointer
    * Counter variable to keep track of tail (end) index and allows us to determine if the mainArray[] is full or not.
    * Default value = -1
* int mainArraySize
    * A global variable to store the static length/size of mainArray[].
    * Default value = -1
---
## Functions/methods
### *void __initMainArray__(int inputLength)*
* If the inputLength <= 0, then we cannot initialize mainArray[] & report an ERROR.
* Else: initialize mainArray[] by allocating adequte # of bytes & increment tailPointer++.

### *void __insertAtHead__(int data)*
* This function takes the specified data and inserts it at the beginning (head) of the mainArray[].
    * If the mainArray is uninitialized/NULL, then we cannot __insertAtHead()__ & report an ERROR.
    * Else: we are dealing with an initialized mainArray[]. However, we need to confirm/verify if there is enough space to __insertAtHead()__.
        * Check if the mainArray[]'s capacity is full.
        * If the tailPointer has not reached the end of the mainArray[] (tailPointer == mainArraySize), then __shiftRight()__ each element and insert data at mainArray[0] & increment tailPointer++.
* __Time complexity:__ O(n) --> linear time
    * This function will require shifting elements at most n - 1 times if we want to __insertAtHead()__ and have a vacant index for the new head element. If we are dealing with single-element arrays, then no shifting is required which results in a constant time O(1) insertion operation.

### *void __removeFromHead__()*
* This function removes the element at the beginning (head) position of the mainArray[].
    * If the mainArray is uninitialized/NULL OR tailPointer == -1, then we cannot __removeFromHead()__ & report an ERROR.
        * Else: We will __shiftLeft()__ and decrement the tailPointer--.
* __Time complexity:__ O(n) --> linear time
    * This function will require shifting elements at most n - 1 times if we want to remove from the head and maintain proper arrangement of elements inside mainArray[]. If we are dealing with single-element arrays, it will require no shifting of elements and execute in O(1) constant time.

### *void __insertAtTail__(int data)*
* This function takes the specified data and inserts it at the end (tail) of the mainArray[].
* If the mainArray is uninitialized/NULL OR tailPointer == -1, then we cannot __insertAtTail()__ & report an ERROR.
    * Else: we will check if the mainArray[]'s capacity is full.
    * If there is enough space to insert an element at the tail, then mainArray[tailPointer] = data & increment tailPointer++.
* __Time complexity:__ O(1) --> constant time
    * We already have a pointer variable to the tail element/position, so as long as tail != mainArray.length (out of bounds), we can insert the specified data in the tail position in constant time.

### *void __removeFromTail__()*
* This function removes the element at the end (tail) of the mainArray[].
* If the mainArray is uninitialized/NULL OR tailPointer == -1, then we cannot __removeFromTail()__ & report an ERROR.
    * Else: Check if the mainArray[] is already empty (tailPointer == 0) & report an ERROR.
    * If mainArray[] is not empty, set mainArray[tailPointer - 1] = 0 & decrement tailPointer--.
* __Time complexity:__ O(1) --> constant time
    * We already have a pointer variable to the tail element/position, so it is easy to locate and decrement tailPointer and "delete" the element at the tail position in constant time.

### *void __sequentialSearch__(int target)*
* This function deploys a sequential search on mainArray[] looking for the specified target data.
* __Time complexity:__ O(n) --> linear time
    * Sequential traversal from i = 0... n - 1 reults in a linear time O(n) operation.

### *void __printArray__()*
* This function will print out each element in the mainArray[] sequentially.
* __Time complexity:__ O(n) --> linear time
    * Sequential traversal of mainArray[] to access each element results in a linear time O(n) operation.
---
## Helper functions/methods
### *private int* __shiftRight__(int[] inputArray, int tailPointer)*
* This function takes the inputArray[] and the current value of the tailPointer and it will return the inputArray[] such that each data item is shifted one space to the right.
* If tailPointer == 1, then we will only swap the first two elements.
    * Else: we will shift all elements one space to the right & set mainArray[0] = 0.
* __Time complexity:__ O(n) --> linear time
    * The tailPointer is incremented every time we __insertAtHead()__ or __insertAtTail()__ and this function will shift every element in the mainArray[] one space to the right up until the value of tailPointer. So when tailPointer == mainArraySize, we will have done at most n - 1 swaps! Hence, resulting in O(n - 1) or O(n) time complexity.

### *private int* __shiftLeft__(int[] inputArray, int tailPointer)*
* This function takes the inputArray[] and the current value of the tailPointer and it will return the inputArray[] such that each data item is shifted one space to the left.
* If tailPointer == 1, then we will simply set mainArray[0] = 0.
    * Else: we will shift elements one space to the left & set inputArray[tailPointer - 1] = 0.
* __Time complexity:__ O(n) --> linear time
    * The tailPointer is decremented every time we __removeFromHead()__ or __removeFromTail()__ and this function will shift every element in the mainArray[] one space to the left up until the value of the tailPointer. So when tailPointer == mainArraySize, we will have done at most n - 1 swaps! Hence, resulting in O(n - 1) or O(n) time complexity.
---
## Common concepts
### How to check if the mainArray[] is uninitialized?
```C
if (mainArray == NULL || tailPointer == -1)
```
### How to check if the mainArray[] is empty?
```C
if (tailPointer == 0)
```
### How to check if the mainArray[] is full?
```C
if (tailPointer == mainArraySize)
```