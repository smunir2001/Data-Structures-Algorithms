# Doubly Linkedlist (C Implementation)

## Member variables
* int[] mainArray
    * Our program's global array to be initialized and image static length/size properties.
    * Default value = null
    * Full CRUD implementation.
* int tailPointer
    * Counter variable to keep track of tail index and allows us to determine if the mainArray[] is full or not.
    * Default value = -1
---
## public functions/methods
### *public __DoublyLinkedlistDS__(int inputLength)*
* If the inputLength <= 0, then we cannot initialize mainArray[] & report an ERROR.
* Else: initialize mainArray[] to inputLength & increment tailPointer++.

### *public void __insertAtHead__(int data)*
* This function takes the specified data and inserts it at the beginning (head) of the mainArray[].
* __Time complexity:__ O(n) --> linear time
    * This function will require shifting elements at most n - 1 times if we want to __insertAtHead()__ and have a vacant index for the new head element. If we are dealing with single-element arrays, then no shifting is required which results in a constant time O(1) insertion operation.

### *public void __removeFromHead__()*
* This function removes the element at the beginning (head) position of the mainArray[].
* __Time complexity:__ O(n) --> linear time
    * This function will require shifting elements at most n - 1 times if we want to remove from the head and maintain proper arrangement of elements inside mainArray[]. If we are dealing with single-element arrays, it will require no shifting of elements and execute in O(1) constant time.

### *public void __insertAtTail__(int data)*
* This function takes the specified data and inserts it at the end (tail) of the mainArray[].
* __Time complexity:__ O(1) --> constant time
    * We already have a pointer variable to the tail element/position, so as long as tail != mainArray.length (out of bounds), we can insert the specified data in the tail position in constant time.

### *public void __removeFromTail__()*
* This function removes the element at the end (tail) of the mainArray[].
* __Time complexity:__ O(1) --> constant time
    * We already have a pointer variable to the tail element/position, so it is easy to locate and decrement tailPointer and "delete" the element at the tail position in constant time.

### *public void __printDoublyLinkedlist__()*
* This function will print out each element in the mainArray[] sequentially.
* __Time complexity:__ O(n) --> linear time
    * Sequential traversal of mainArray[] to access each element results in a linear time O(n) operation.
---
## Common concepts
### How to check if the mainArray[] is uninitialized?
```java
if (mainArray == null || tailPointer == -1)
```
### How to check if the mainArray[] is empty?
```java
if (tailPointer == 0)
```
### How to check if the mainArray[] is full?
```java
if (tailPointer == mainArray.length)
```