#include <stdio.h>
#include <stdlib.h>

int *mainQueue = NULL;
int front = -1;
int mainQueueSize = 0;

void initArrayQueue() {
    printf("Successfully initializing mainQueue.\n");
}

void enqueue(int data) {
    printf("\nSUCCESS: enqueue(%d) into mainQueue.\n", data);
    if (mainQueue == NULL) {
        mainQueueSize++;
        mainQueue = (int*) malloc(mainQueueSize * sizeof(int));
        front++;
        mainQueue[front] = data;
    } else {
        mainQueueSize++;
        int *tempArrayQueue = (int*) malloc(mainQueueSize * sizeof(int));
        for (int i = 0; i < mainQueueSize - 1; i++) {
            tempArrayQueue[i] = mainQueue[i];
        }
        front++;
        tempArrayQueue[front] = data;
        mainQueue = tempArrayQueue;
    }
}

void peek() {
    if (mainQueue == NULL) {
        printf("ERROR: cannot peek() front of mainQueue.\n");
    } else {
        printf("SUCCESS: mainQueue.peek() --> %d\n", mainQueue[0]);
    }
}

void dequeue() {
    if (mainQueue == NULL) {
        printf("\nERROR: cannot dequeue() from empty/null mainQueue.\n");
    } else {
        printf("\nSUCCESS: dequeue(%d) from mainQueue.\n", mainQueue[0]);
        if (front == 0) {
            mainQueue = NULL;
            mainQueueSize = 0;
            front = -1;
        } else {
            mainQueueSize--;
            int *tempArrayQueue = (int*) malloc(mainQueueSize * sizeof(int));
            for (int i = 0; i < mainQueueSize; i++) {
                tempArrayQueue[i] = mainQueue[i + 1];
            }
            front--;
            mainQueue = tempArrayQueue;
        }
    }
}

void printArrayQueue() {
    if (mainQueue == NULL) {
        printf("mainQueue: []\n");
    } else {
        printf("mainQueue: [");
        for (int i = 0; i < mainQueueSize; i++) {
            printf("%d, ", mainQueue[i]);
        }
        printf("\b\b]\n");
    }
}

int main(int argc, char* argv[]) {
    printf("ArrayQueue.c\n");
    printf("------------\n");
    initArrayQueue();
    printArrayQueue();
    enqueue(0);
    printArrayQueue();
    peek();
    enqueue(1);
    printArrayQueue();
    peek();
    enqueue(2);
    printArrayQueue();
    peek();
    dequeue();
    printArrayQueue();
    peek();
    dequeue();
    printArrayQueue();
    peek();
    dequeue();
    printArrayQueue();
    peek();
    return EXIT_SUCCESS;
}