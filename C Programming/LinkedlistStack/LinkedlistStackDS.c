#include <stdio.h>
#include <stdlib.h>

struct LLStackNode {
    int data;
    struct LLStackNode *next;
} *head = NULL;

void push(int data) {
    printf("\nSUCCESS: pushing(%d) into linkedlist stack.\n", data);
    if (head == NULL) {
        head = (struct LLStackNode*) malloc(sizeof(struct LLStackNode));
        head -> data = data;
        head -> next = NULL;
    } else {
        struct LLStackNode *newHead = (struct LLStackNode*) malloc(sizeof(struct LLStackNode));
        newHead -> data = data;
        newHead -> next = head;
        head = newHead;
    }
}

void peek() {
    if (head == NULL) {
        printf("ERROR: cannot peek from empty linkedlist stack.\n");
    } else {
        printf("SUCCESS: head.peek() --> %d.\n", head -> data);
    }
}

void pop() {
    if (head == NULL) {
        printf("\nERROR: cannot pop() from empty linkedlist stack.\n");
    } else {
        printf("\nSUCCESS: popping(%d) from linkedlist stack.", head -> data);
        if (head -> next == NULL) {
            head = NULL;
        } else {
            head = head -> next;
        }
    }
}

void printLinkedlistStack() {
    if (head == NULL) {
        printf("HEAD\n----\n");
        printf("xxxx\n");
        printf("----\nNULL\n");
    } else {
        printf("HEAD\n----\n");
        struct LLStackNode *currentNode = head;
        while (currentNode != NULL) {
            printf("%d\n", currentNode -> data);
            currentNode = currentNode -> next;
        }
        printf("----\nNULL\n");
    }
}

int main(int argc, char* argv[]) {
    printf("LinkedlistStack.c\n");
    printf("-----------------\n");
    printLinkedlistStack();
    push(3);
    printLinkedlistStack();
    peek();
    push(22);
    printLinkedlistStack();
    peek();
    push(7);
    printLinkedlistStack();
    peek();
    push(81);
    printLinkedlistStack();
    peek();
    pop();
    printLinkedlistStack();
    peek();
    pop();
    printLinkedlistStack();
    peek();
    pop();
    printLinkedlistStack();
    peek();
    pop();
    printLinkedlistStack();
    peek();
    pop(); // ERROR
    printLinkedlistStack();
    peek();
    return EXIT_SUCCESS;
}