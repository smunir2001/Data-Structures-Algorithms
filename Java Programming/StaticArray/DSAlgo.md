<!-- Headings -->
# Static Array (Java Implementation)

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
### *public __StaticArrayDS__(int inputLength)*
* If the inputLength <= 0, then we cannot initialize mainArray[] & report an ERROR.
* Else: initialize mainArray[] to inputLength & increment tailPointer++.

### *public void __insertAtHead__(int data)*
* This function takes the specified data and inserts it at the beginning (head) of the mainArray[].
    * If the mainArray is uninitialized/null, then we cannot __insertAtHead()__ & report an ERROR.
    * Else: we are dealing with an initialized mainArray[]. However, we need to confirm/verify if there is enough space to __insertAtHead()__.
        * Check if the mainArray[]'s capacity is full.
        * If the tailPointer has not reached the end of the mainArray[] (tailPointer == mainArray.length), then __shiftRight()__ each element and insert data at mainArray[0] & increment tailPointer++.
* __Time complexity:__ O(n) --> linear time
    * This function will require shifting elements at most n - 1 times if we want to __insertAtHead()__ and have a vacant index for the new head element. If we are dealing with single-element arrays, then no shifting is required which results in a constant time O(1) insertion operation.

### *public void __removeFromHead__()*
* This function removes the element at the beginning (head) position of the mainArray[].
    * If the mainArray is uninitialized/null OR tailPointer == 0 OR tailPointer == -1, then we cannot __removeFromHead()__ & report an ERROR.
    * Else: We will __shiftLeft()__ and decrement the tailPointer--.
* __Time complexity:__ O(n) --> linear time
    * This function will require shifting elements at most n - 1 times if we want to remove from the head and maintain proper arrangement of elements inside mainArray[]. If we are dealing with single-element arrays, it will require no shifting of elements and execute in O(1) constant time.

### *public void __insertAtTail__(int data)*
### *public void __removeFromTai__l()*
### *public void __insertAtHead__(int data)*
### *public void __sequentialSearch__(int target)*
### *public void __printArray__()*
---
## private functions/methods
### *private int[] __shiftRight__(int[] inputArray, int tailPointer)*
* This function takes the inputArray[] and the current value of the tailPointer and it will return the inputArray[] such that each data item is shifted one space to the right.
* If tailPointer == 1, then we will only swap the first two elements.
    * Else: we will shift all elements one space to the right & set mainArray[0] = 0.
* __Time complexity:__ O(n) --> linear time

### *private int[] __shiftLeft__(int[] inputArray, int tailPointer)*
* This function takes the inputArray[] and the current value of the tailPointer and it will return the inputArray[] such that each data item is shifted one space to the left.
* If tailPointer == 1, then we will simply set mainArray[0] = 0.
    * Else: we will shift elements one space to the left & set inputArray[tailPointer - 1] = 0.
* __Time complexity:__ O(n) --> linear time
---

<!-- Strikethrough -->
~~This text~~ is strikethrough.

<!-- Blockquote -->
> This is a quote

<!-- Link -->
<!-- [My link](www.google.com) -->

<!-- UL -->
<!-- * Item 1
* Item 2
* Item 3
    * Nested item 1
    * Nested item 2 -->

<!-- OL -->
<!-- 1. Item 1
1. Item 2
1. Item 3 -->

<!-- Inline Code Block -->
<!-- `<p>This is a paragraph</p> -->

<!-- Images -->
<!-- ![Markdown Logo](https://markdown-here.com/img/icon256.png) -->

```bash
 npm install
 npm start
```

```javascript
 function add(num1, num2) {
     return num1 + num2;
 }
```

```python
 def add(num1, num2):
     return num1 + num2
```

<!-- Tables -->
<!-- | Name      | Email         |
|---------- | --------------|
|John Doe   | john@gmail.com|
|Jane Doe   | jane@gmail.com|

<!-- Task Lists -->
<!-- * [x] Task 1
* [x] Task 2
* [ ] Task 3 -->