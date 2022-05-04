/*
    SinglyLinkedlistDS.c
    - Singly linkedlist data structure & algorithm implementation.
*/
#include <stdio.h>
#include <stdlib.h>

struct SinglyLLNode {
    int data;
    struct SinglyLLNode* next;
} *head = NULL;

void insertAtHead(int data) {
    printf("\nSUCCESS: insertingAtHead(%d) in singly linkedlist.", data);
    if (head == NULL) {
        head = (struct SinglyLLNode*) malloc(sizeof(struct SinglyLLNode));
        head -> data = data;
        head -> next = NULL;
    } else {
        struct SinglyLLNode *newNode = (struct SinglyLLNode*) malloc(sizeof(struct SinglyLLNode));
        newNode -> data = data;
        newNode -> next = head;
        head = newNode;
    }
}

void removeFromHead() {
    if (head == NULL) {
        printf("\nERROR: cannot removeFromHead() from empty singly linkedlist.");
    } else {
        printf("\nSUCCESS: removingFromHead(%d) from singly linkedlist.", head -> data);
        head = head -> next;
    }
}

void insertAtTail(int data) {
    printf("\nSUCCESS: insertingAtTail(%d) in singly linkedlist.", data);
    if (head == NULL) {
        head = (struct SinglyLLNode*) malloc(sizeof(struct SinglyLLNode));
        head -> data = data;
        head -> next = NULL;
    } else {
        struct SinglyLLNode *currentNode = head;
        while (currentNode != NULL && currentNode -> next != NULL) {
            currentNode = currentNode -> next;
        }
        struct SinglyLLNode *newNode = (struct SinglyLLNode*) malloc(sizeof(struct SinglyLLNode));
        newNode -> data = data;
        newNode -> next = NULL;
        currentNode -> next = newNode;
    }
}

void removeFromTail() {
    if (head == NULL) {
        printf("\nERROR: cannot removeFromTail() from empty singly linkedlist.");
    } else if (head != NULL && head -> next == NULL) {
        printf("\nSUCCESS: removingFromTail(%d) from singly linkedlist.", head -> data);
        head = NULL;
    } else {
        struct SinglyLLNode *currentNode = head;
        while (currentNode != NULL && currentNode -> next -> next != NULL) {
            currentNode = currentNode -> next;
        }
        printf("\nSUCCESS: removingFromTail(%d) from singly linkedlist.", currentNode -> next -> data);
        currentNode -> next = NULL;
    }
}

void printSinglyLinkedlist() {
    if (head == NULL) {
        printf("\nHEAD -> NULL\n");
    } else {
        printf("\nHEAD -> ");
        struct SinglyLLNode *currentNode = head;
        while (currentNode != NULL) {
            printf("%d -> ", currentNode -> data);
            currentNode = currentNode -> next;
        }
        printf("NULL\n");
    }
}

int main(int argc, char* argv[]) {
    printf("SinglyLinkedlistDS.c\n");
    printf("--------------------\n");
    printSinglyLinkedlist();
    insertAtHead(3);
    printSinglyLinkedlist();
    insertAtHead(22);
    printSinglyLinkedlist();
    insertAtHead(7);
    printSinglyLinkedlist();
    insertAtHead(81);
    printSinglyLinkedlist();
    removeFromTail();
    printSinglyLinkedlist();
    removeFromTail();
    printSinglyLinkedlist();
    removeFromHead();
    printSinglyLinkedlist();
    removeFromTail();
    printSinglyLinkedlist();
    return EXIT_SUCCESS;
}