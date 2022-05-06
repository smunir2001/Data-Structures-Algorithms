/*
    DoublyLinkedlistDS.c
    - Doubly linkedlist data structure & algorithm implementation.
*/
#include <stdio.h>
#include <stdlib.h>

struct DoublyLLNode {
    int data;
    struct DoublyLLNode *next;
    struct DoublyLLNode *previous;
} *head = NULL, *tail = NULL;

void insertAtHead(int data) {
    printf("\nSUCCESS: insertingAtHead(%d) in doubly linkedlist.", data);
    if (head == NULL) {
        head = (struct DoublyLLNode*) malloc(sizeof(struct DoublyLLNode));
        head -> data = data;
        head -> next = NULL;
        head -> previous = NULL;
        tail = head;
    } else {
        struct DoublyLLNode *newHead = (struct DoublyLLNode*) malloc(sizeof(struct DoublyLLNode));
        newHead -> data = data;
        newHead -> next = head;
        newHead -> previous = NULL;
        head = newHead;
    }
}

void removeFromHead() {
    if (head == NULL) {
        printf("\nERROR: cannot removeFromHead() from empty doubly linkedlist.");
    } else {
        printf("\nSUCCESS: removingFromHead(%d) from doubly linkedlist.", head -> data);
        if (head -> next == NULL) {
            head = NULL;
            tail = NULL;
        } else {
            head -> next -> previous = NULL;
            head = head -> next;
        }
    }
}

void insertAtTail(int data) {
    printf("\nSUCCESS: insertingAtTail(%d) in doubly linkedlist.", data);
    if (head == NULL) {
        head = (struct DoublyLLNode*) malloc(sizeof(struct DoublyLLNode));
        head -> data = data;
        head -> next = NULL;
        head -> previous = NULL;
        tail = head;
    } else {
        struct DoublyLLNode *newTail = (struct DoublyLLNode*) malloc(sizeof(struct DoublyLLNode));
        newTail -> data = data;
        newTail -> next = NULL;
        newTail -> previous = tail;
        tail -> next = newTail;
        tail = tail -> next;
    }
}

void removeFromTail() {
    if (head == NULL) {
        printf("\nERROR: cannot removeFromTail() from empty doubly linkedlist.");
    } else {
        printf("\nSUCCESS: removingFromTail(%d) from singly linkedlist.", tail -> data);
        if (tail -> previous == NULL) {
            head = NULL;
            tail = NULL;
        } else {
            tail -> previous -> next = NULL;
            tail = tail -> previous;
        }
    }
}

void printDoublyLinkedlist() {
    if (head == NULL) {
        printf("\nHEAD -> NULL\n");
    } else {
        printf("\nHEAD -> ");
        struct DoublyLLNode *currentNode = head;
        while (currentNode != NULL) {
            printf("%d -> ", currentNode -> data);
            currentNode = currentNode -> next;
        }
        printf("NULL\n");
    }
}

int main(int argc, char* argv[]) {
    printf("DoublyLinkedlistDS.c\n");
    printf("--------------------\n");
    printDoublyLinkedlist();
    insertAtHead(3);
    printDoublyLinkedlist();
    insertAtHead(22);
    printDoublyLinkedlist();
    insertAtHead(7);
    printDoublyLinkedlist();
    insertAtHead(81);
    printDoublyLinkedlist();
    removeFromHead();
    printDoublyLinkedlist();
    removeFromHead();
    printDoublyLinkedlist();
    removeFromHead();
    printDoublyLinkedlist();
    removeFromHead();
    printDoublyLinkedlist();
    insertAtTail(3);
    printDoublyLinkedlist();
    insertAtTail(22);
    printDoublyLinkedlist();
    insertAtTail(7);
    printDoublyLinkedlist();
    insertAtTail(81);
    printDoublyLinkedlist();
    return EXIT_SUCCESS;
}