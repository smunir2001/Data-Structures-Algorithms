/*
    DynamicArrayDS.c
    - Dynamic array data structure & algorithm implementation.
*/
#include <stdio.h>
#include <stdlib.h>

int* mainArray = NULL;
int tailPointer = -1;
int mainArraySize = -1;

int getTailPointer() {
    return tailPointer;
}

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
            mainArraySize++;
            printf("\nResizing mainArray[] to length/size = %d.\n", mainArraySize);
            printf("SUCCESS: insertingAtHead(%d) in mainArray[].\n", data);
            int* tempArray = (int*) malloc(mainArraySize * sizeof(int));
            for (int i = 0; i < mainArraySize - 1; i++) {
                tempArray[i + 1] = mainArray[i];
            }
            tempArray[0] = data;
            mainArray = tempArray;
            tailPointer++;
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
            mainArraySize++;
            printf("\nResizing mainArray[] to length/size = %d.\n", mainArraySize);
            printf("SUCCESS: insertingAtTail(%d) in mainArray[].\n", data);
            int* tempArray = (int*) malloc(mainArraySize * sizeof(int));
            for (int i = 0; i < mainArraySize - 1; i++) {
                tempArray[i] = mainArray[i];
            }
            tempArray[tailPointer] = data;
            mainArray = tempArray;
            tailPointer++;
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
    // printf("tailPointer = %d\n", getTailPointer());
    // insertAtHead(3);
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());
    // removeFromHead();
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());
    // insertAtTail(22);
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());
    // removeFromTail();
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());

    // printf("\narr2 -->\n");
    // initMainArray(1);
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());
    // insertAtHead(3);
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());
    // removeFromHead();
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());
    // insertAtTail(22);
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());
    // removeFromTail();
    // printArray();
    // printf("tailPointer = %d\n", getTailPointer());

    printf("\narr3 -->\n");
    initMainArray(5);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtHead(3);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtTail(22);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtHead(7);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtTail(81);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    removeFromHead();
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    removeFromTail();
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    removeFromHead();
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    removeFromTail();
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    removeFromHead();
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtHead(200);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtTail(300);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtHead(100);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtTail(400);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtHead(75);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtTail(500);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());
    insertAtTail(600);
    printArray();
    printf("tailPointer = %d\n", getTailPointer());

    return EXIT_SUCCESS;
}