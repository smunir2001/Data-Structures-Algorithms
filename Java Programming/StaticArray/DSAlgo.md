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
* If the mainArray is uninitialized/null, then we cannot __insertAtHead()__ & report an ERROR.
* Else: we are dealing with an initialized mainArray[]. However, we need to confirm/verify if there is enough space to __insertAtHead()__.
    * Check if the mainArray[]'s capacity is full.
    * If the tailPointer has not reached the end of the mainArray[] (tailPointer == mainArray.length), then __shiftRight()__ each element and insert data at mainArray[0] & increment tailPointer++.
### *public void __removeFromHead__()*
### *public void __insertAtTail__(int data)*
### *public void __removeFromTai__l()*
### *public void __insertAtHead__(int data)*
### *public void __sequentialSearch__(int target)*
### *public void __printArray__()*
---
## private functions/methods
### *private int[] __shiftRight__(int[] inputArray, int tailPointer)*
### *private int[] __shiftLeft__(int[] inputArray, int tailPointer)*

<!-- Italics -->
*This text* is italic.
\*This text is not italic.
_This text_ is italic.

<!-- Strong -->
**This text** is strong.
__This text__ is strong.

<!-- Strikethrough -->
~~This text~~ is strikethrough.

<!-- Horizontal rule -->
---
____

<!-- Blockquote -->
> This is a quote

<!-- Link -->
[My link](www.google.com)

<!-- UL -->
* Item 1
* Item 2
* Item 3
    * Nested item 1
    * Nested item 2

<!-- OL -->
1. Item 1
1. Item 2
1. Item 3

<!-- Inline Code Block -->
`<p>This is a paragraph</p>

<!-- Images -->
![Markdown Logo](https://markdown-here.com/img/icon256.png)

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
| Name      | Email         |
|---------- | --------------|
|John Doe   | john@gmail.com|
|Jane Doe   | jane@gmail.com|

<!-- Task Lists -->
* [x] Task 1
* [x] Task 2
* [ ] Task 3