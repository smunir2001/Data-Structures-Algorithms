# Singly Linkedlist (Java Implementation)

## Member variables
* SinglyLLNode head
    * Our program's global reference to the object's head node of the singly linkedlist.
    * Default value = null
    * Full CRUD implementation.
---
## public functions/methods
### *public __SinglyLinkedlistDS__()*
* Constructor to verify initialization of singly linkedlist object.
* Returns a success message.

### *public void __insertAtHead__(int data)*
* This function takes the specified data and inserts it at the beginning (head node) of the singly linkedlist.
    * If the singly linkedlist is uninitialized/null, then we will create a new head node and initialize its members:
        * newHead.data = data
        * newHead.next = null
        * We will then set head as the newHead of our linkedlist.
    * Else: we are dealing with an initialized singly linkedlist and we can still __insertAtHead()__ which means there currently is a head node.
        * So we will, this time, create a new head node and initialize its memebers in this manner:
            * newHead.data = data;
            * newHead.next = head;
            * And now we will set our head as the newHead of our linkedlist.
* __Time complexity:__ O(1) --> constant time
    * This function will simply use the reference to our head node and perform the same number of operations independent on the number of nodes in our singly linkedlist.
        1. Initializing newHeadNode member variables (data & next).
        2. Assigning head to be the newHeadNode.

### *public void __removeFromHead__()*
* This function removes the element at the beginning (head node) position of the singly linkedlist.
    * If the singly linkedlist is uninitialized/null, then we cannot __removeFromHead()__ & report an ERROR.
    * If there does exist a head node (singly linkedlist != null), then we will simply set head = head.next
        * This will remove the head node from our singly linkedlist.
* __Time complexity:__ O(1) --> constant time
    * This function will simply use the reference to our head node and perfrom the same number of operations independent on the number of nodes in our singly linkedlist.
        1. Checking if the singly linkedlist is null.
        2. Assigning head to the next node.

### *public void __insertAtTail__(int data)*
* This function takes the specified data and inserts it at the end (tail node) of the singly linkedlist.
    * If the singly linkedlist is uninitialized/null, then we will create a new tail node and initialize its members:
        * newHead.data = data
        * newHead.next = null
        * We will then set the head reference to our newTailNode.
            * head = newTailNode
    * Else: we are dealing with an initialized singly linkedlist and we can still __insertAtHead()__ which means there currently is a head node.
        * So we will, this time, create a new head node and initialize its memebers in this manner:
            * newHead.data = data;
            * newHead.next = null;
            * We will then have to traverse from the head node to the last node and set its next reference to the new tail node.
                * currentNode.next = newTailNode
* __Time complexity:__ O(n) --> linear time
    * This function will have to traverse the linkedlist to the tail node so that we can __insertAtTail()__. This would always require traversing n nodes in the worst case scenario resulting in a linear-time operation.

### *public void __removeFromTail__()*
* This function removes the element at the end (tail node) position of the singly linkedlist.
    * If the singly linkedlist is uninitialized/null, then we cannot __removeFromTail()__ & report an ERROR.
    * If there does exist a head node (singly linkedlist != null), then we will have to traverse from the head node to the 2nd to last tail node and set that node's next pointer to null.
        * currentNode.next = null
        * This will remove the tail node from our singly linkedlist.
* __Time complexity:__ O(n) --> linear time
    * This function will have to traverse the linkedlist to the 2nd to last tail node so that we can __removetAtTail()__. This would always require traversing n nodes in the worst case scenario resulting in a linear-time operation.

### *public void __printSinglyLinkedlist__()*
* This function will print out each node.data in the singly linkedlist sequentially.
* __Time complexity:__ O(n) --> linear time
    * Sequential traversal of singly linkedlist to access each node results in a linear-time O(n) operation.
---
## Common concepts
### How to check if the singly linkedlist is uninitialized?
```java
if (head == null)
```
### How to check if the mainArray[] is empty?
```java
if (head == null)
```