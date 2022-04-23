/*
    StaticArrayDS.c
    - Static array data structure & algorithm implementation.
*/
#include <stdio.h>
#include <stdlib.h>

int* mainArray = NULL;
int tailPointer = -1;
int mainArraySize = -1;

void initMainArray(int inputLength) {
    if (inputLength <= 0) {
        printf("ERROR: cannot initialize mainArray[] with inputLength = %d.\n", inputLength);
    } else {
        printf("SUCCESS: initializing mainArray[] to length = %d.\n", inputLength);
        mainArraySize = inputLength;
        mainArray = (int*) malloc(mainArraySize * sizeof(int));
        tailPointer++;
    }
}

int* shiftRight(int* inputArray, int tailPointer) {
    if (tailPointer == 1) {
        inputArray[1] = inputArray[0];
        inputArray[0] = 0;
        return inputArray;
    } else {
        for (int i = tailPointer; i >= 1; i--) {
            inputArray[i] = inputArray[i - 1];
        }
        return inputArray;
    }
}

int* shiftLeft(int* inputArray, int tailPointer) {
    for (int i = 0; i < tailPointer - 1; i++) {
        inputArray[i] = inputArray[i + 1];
    }
    inputArray[tailPointer - 1] = 0;
    return inputArray;
}

void insertAtHead(int data) {
    if (mainArray == NULL  || tailPointer == -1) {
        printf("\nERROR: cannot insertAtHead(%d) in uninitialized/NULL mainArray[].\n", data);
    } else {
        if (tailPointer == mainArraySize) {
            printf("\nERROR: cannot insertAtHead(%d) in full capacity mainArray[].\n", data);
        } else {
            printf("\nSUCCESS: insertingAtHead(%d) in mainArray[].\n", data);
            mainArray = shiftRight(mainArray, tailPointer);
            mainArray[0] = data;
            tailPointer++;
        }
    }
}

void removeFromHead() {
    if (mainArray == NULL || tailPointer == -1) {
        printf("\nERROR: cannot removeFromHead() from uninitialized/NULL mainArray[].\n");
    } else {
        if (tailPointer == 0) {
            printf("\nERROR: cannot removeFromHead() from empty mainArray[].\n");
        } else {
            printf("\nSUCCESS: removingFromHead(%d) from mainArray[].\n", mainArray[0]);
            mainArray = shiftLeft(mainArray, tailPointer);
            tailPointer--;
        }
    }
}

void insertAtTail(int data) {
    if (mainArray == NULL || tailPointer == -1) {
        printf("\nERROR: cannot insertAtTail(%d) in uninitialized/NULL mainArray[].\n", data);
    } else {
        if (tailPointer == mainArraySize) {
            printf("\nERROR: cannot insertAtTail(%d) in full capacity mainArray[].\n", data);
        } else {
            printf("\nSUCCESS: insertingAtTail(%d) in mainArray[].\n", data);
            mainArray[tailPointer] = data;
            tailPointer++;
        }
    }
}

void removeFromTail() {
    if (mainArray == NULL || tailPointer == -1) {
        printf("\nERROR: cannot removeFromTail() from uninitialized/NULL mainArray[].\n");
    } else {
        if (tailPointer == 0) {
            printf("\nERROR: cannot removeFromTail() from empty mainArray[].\n");
            return;
        }
        printf("\nSUCCESS: removingFromTail(%d) from mainArray[].\n", mainArray[tailPointer - 1]);
        mainArray[tailPointer - 1] = 0;
        tailPointer--;
    }
}

void sequentialSearch(int target) {
    int isFound = 0;
    for (int i = 0; i < mainArraySize; i++) {
        if (mainArray[i] == target) {
            isFound = 1;
            break;
        }
    }
    if (isFound == 1) {
        printf("\nSUCCESS: target(%d) found in mainArray[].\n", target);
    } else {
        printf("\nERROR: target(%d) not  found in mainArray[].\n", target);
    }
}

void printArray() {
    if (mainArray == NULL || tailPointer == -1) {
        printf("mainArray[]: []\n");
    } else {
        printf("mainArray[]: [");
        for (int i = 0; i < mainArraySize; i++) {
            printf("%d, ", mainArray[i]);
        }
        printf("\b\b]\n");
    }
}

int main(int argc, char* argv[]) {
    printf("StaticArrayDS.c\n");
    printf("---------------\n");

    // printf("\narr1 -->\n");
    // initMainArray(0);
    // printArray();
    // insertAtHead(3); // this will report an ERROR
    // printArray();

    // printf("\narr2 -->\n");
    // initMainArray(1);
    // printArray();
    // insertAtHead(3);
    // printArray();
    // insertAtHead(22); // this will report an ERROR
    // printArray();

    printf("\narr3 -->\n");
    initMainArray(5);
    printArray();
    insertAtHead(3);
    printArray();
    insertAtTail(22);
    printArray();
    removeFromHead();
    printArray();
    removeFromTail();
    printArray();
    insertAtHead(100);
    printArray();
    insertAtHead(200);
    printArray();
    insertAtHead(300);
    printArray();
    insertAtTail(90);
    printArray();
    insertAtTail(80);
    printArray();
    insertAtTail(75);
    printArray();
    // insertAtHead(22);
    // printArray();
    // insertAtHead(7);
    // printArray();
    // insertAtHead(81);
    // printArray();
    // insertAtHead(146);
    // printArray();
    // insertAtHead(100); // this will report an ERROR
    // printArray();

    return EXIT_SUCCESS;
}