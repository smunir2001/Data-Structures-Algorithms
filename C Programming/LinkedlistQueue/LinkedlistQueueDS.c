#include <stdio.h>
#include <stdlib.h>

struct LLQNode {
    int data;
    struct LLQNode *next;
    struct LLQNode *prev;
} *front = NULL, *rear = NULL;

int size = 0;

void initLLQueue() {
    printf("Successfully initialized linkedlist queue.\n");
}

void enqueue(int data) {
    printf("\nSUCCESS: enqueue(%d) into linkedlist queue.\n", data);
    if (front == NULL) {
        front = (struct LLQNode*) malloc(sizeof(struct LLQNode));
        front -> data = data;
        front -> next = NULL;
        front -> prev = NULL;
        rear = front;
        size = 1;
    } else {
        struct LLQNode *newQNode = (struct LLQNode*) malloc(sizeof(struct LLQNode));
        newQNode -> data = data;
        newQNode -> next = NULL;
        newQNode -> prev = rear;
        rear -> next = newQNode;
        rear = rear -> next;
        size++;
    }
}

void peek() {
    if (front == NULL) {
        printf("ERROR: cannot peek() at front of empty/null linkedlist queue.\n");
    } else {
        printf("SUCCESS: LLQ.peek() -> %d.\n", front -> data);
    }
}

void dequeue() {
    if (front == NULL) {
        printf("\nERROR: cannot dequeue() from empty/null linkedlist queue.\n");
    } else {
        printf("\nSUCCESS: dequeue(%d) from linkedlist queue.\n", front -> data);
        if (front -> next == NULL) {
            front = NULL;
            rear = NULL;
            size = 0;
        } else {
            front = front -> next;
            front -> prev = NULL;
            size--;
        }
    }
}

void printLinkedlistQueue() {
    if (front == NULL) {
        printf("LLQ: FRONT -> REAR\n");
    } else {
        printf("LLQ: FRONT -> ");
        struct LLQNode *currentNode = front;
        while (currentNode != NULL) {
            printf("%d -> ", currentNode -> data);
            currentNode = currentNode -> next;
        }
        printf("REAR\n");
    }
}

int main(int argc, char* argv[]) {
    printf("LinkedlistQueue.c\n");
    printf("-----------------\n");
    initLLQueue();
    printLinkedlistQueue();
    enqueue(0);
    printLinkedlistQueue();
    peek();
    enqueue(1);
    printLinkedlistQueue();
    peek();
    enqueue(2);
    printLinkedlistQueue();
    peek();
    enqueue(3);
    printLinkedlistQueue();
    peek();
    dequeue();
    printLinkedlistQueue();
    peek();
    dequeue();
    printLinkedlistQueue();
    peek();
    dequeue();
    printLinkedlistQueue();
    peek();
    dequeue();
    printLinkedlistQueue();
    peek();
    dequeue(); // this will report an ERROR
    printLinkedlistQueue();
    peek(); // this will report an ERROR
    enqueue(100);
    printLinkedlistQueue();
    peek();
    enqueue(200);
    printLinkedlistQueue();
    peek();
    dequeue();
    printLinkedlistQueue();
    peek();
    return EXIT_SUCCESS;
}