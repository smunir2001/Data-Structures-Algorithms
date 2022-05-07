#include <stdio.h>
#include <stdlib.h>

int *mainStack = NULL;
int top = -1;
int size = 0;

void push(int data) {
    printf("\nSUCCESS: pushing(%d) into array stack.", data);
    if (mainStack == NULL) {
        mainStack = (int*) malloc(sizeof(int));
        top = 0;
        mainStack[top] = data;
        size++;
    } else {
        if (top == 0) {
            int *tempStack = (int*) malloc((size + 1) * sizeof(int));
            tempStack[top] = mainStack[top];
            top++;
            tempStack[top] = data;
            mainStack = tempStack;
            size++;
        } else {
            int *tempStack = (int*) malloc((size + 1) * sizeof(int));
            for (int i = 0; i < size; i++) {
                tempStack[i] = mainStack[i];
            }
            top++;
            tempStack[top] = data;
            mainStack = tempStack;
            size++;
        }
    }
}

void peek() {
    if (mainStack == NULL) {
        printf("\nERROR: cannot peek from empty array stack.");
    } else {
        printf("\nmainStack.peek() --> %d\n", mainStack[top]);
    }
}

void pop() {
    if (mainStack == NULL) {
        printf("\nERROR: cannot pop() from empty array stack.");
    } else {
        printf("\nSUCCESS: popping(%d) from array stack.", mainStack[top]);
        if (top == 0) {
            mainStack = NULL;
            top--;
            size--;
        } else {
            int *tempStack = (int*) malloc((size - 1) * sizeof(int));
            size--;
            for (int i = 0; i < size; i++) {
                tempStack[i] = mainStack[i];
            }
            top--;
            mainStack = tempStack;
        }
    }
}

void printArrayStack() {
    if (top == -1) {
        printf("\nTOP\n----\n");
        printf("----\n");
    } else {
        printf("\nTOP\n----\n");
        for (int i = size - 1; i >= 0; i--) {
            printf("%d\n", mainStack[i]);
        }
        printf("----\n");
    }
}

int main(int argc, char* argv[]) {
    printf("ArrayStack.c\n");
    printf("------------\n");
    printArrayStack();
    push(3);
    printArrayStack();
    push(22);
    printArrayStack();
    push(7);
    printArrayStack();
    push(81);
    printArrayStack();
    peek();
    pop();
    printArrayStack();
    pop();
    printArrayStack();
    pop();
    printArrayStack();
    pop();
    printArrayStack();
    return EXIT_SUCCESS;
}