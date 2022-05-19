import java.util.Arrays;

public class BinaryTreeDS {

    BTNode root = null;
    int size = 0;

    public BinaryTreeDS() {
        System.out.println("Successfully initialized binary tree.");
    }

    public BinaryTreeDS(BTNode root) {
        System.out.println("Successfully initialized binary tree with root node.");
        this.root = root;
    }

    public void depthFirstSearch() {
        if (root == null) {
            System.out.println("\ndepthFirstSearch(): []");
        } else {
            DFSLLStack dfsStack = new DFSLLStack();
            int[] dfsVals = new int[6];
            int index = -1;
            dfsStack.push(root);
            while (dfsStack.isEmpty() != true) {
                LLStackNode currentNode = dfsStack.pop();
                index++;
                dfsVals[index] = currentNode.getNode().getData();
                if (currentNode.getNode().getLeft() != null) {
                    dfsStack.push(currentNode.getNode().getLeft());
                }
                if (currentNode.getNode().getRight() != null) {
                    dfsStack.push(currentNode.getNode().getRight());
                }
            }
            System.out.println("\ndepthFirstSearch(): " + Arrays.toString(dfsVals));
        }
    }

    public void breadthFirstSearch() {
        if (root == null) {
            System.out.println("\nbreadthFirstSearch(): []");
        } else {
            BFSLLQueue bfsQueue = new BFSLLQueue();
            int[] bfsVals = new int[6];
            int index = -1;
            bfsQueue.enqueue(root);
            while (bfsQueue.isEmpty() != true) {
                LLQueueNode currentNode = bfsQueue.dequeue();
                index++;
                bfsVals[index] = currentNode.getNode().getData();
                if (currentNode.getNode().getLeft() != null) {
                    bfsQueue.enqueue(currentNode.getNode().getLeft());
                }
                if (currentNode.getNode().getRight() != null) {
                    bfsQueue.enqueue(currentNode.getNode().getRight());
                }
            }
            System.out.println("\nbreadthFirstSearch(): " + Arrays.toString(bfsVals));
        }
    }

    public void doesContain(int target) {
        if (root == null) {
            System.out.println("\nERROR: cannot search for target element in empty/null binary tree.");
        } else {
            boolean doesExist = false;
            BFSLLQueue bfsQueue = new BFSLLQueue();
            bfsQueue.enqueue(root);
            while (bfsQueue.isEmpty() != true) {
                LLQueueNode currentNode = bfsQueue.dequeue();
                if (currentNode.getNode().getData() == target) {
                    doesExist = true;
                    break;
                } else {
                    if (currentNode.getNode().getLeft() != null) {
                        bfsQueue.enqueue(currentNode.getNode().getLeft());
                    }
                    if (currentNode.getNode().getRight() != null) {
                        bfsQueue.enqueue(currentNode.getNode().getRight());
                    }
                }
            }
            if (doesExist == true) {
                System.out.println("\nSUCCESS: target element(" + target + ") found in binary tree.");
            } else {
                System.out.println("\nERROR: target element(" + target + ") not found in binary tree.");
            }
        }
    }

    public void sumNodeVals() {
        if (root == null) {
            System.out.println("\nERROR: cannot get sum of nodes from empty/null binary tree.");
        } else {
            DFSLLStack dfsStack = new DFSLLStack();
            dfsStack.push(root);
            int sumOfNodeVals = 0;
            while (dfsStack.isEmpty() != true) {
                LLStackNode currentNode = dfsStack.pop();
                sumOfNodeVals += currentNode.getNode().getData();
                if (currentNode.getNode().getLeft() != null) {
                    dfsStack.push(currentNode.getNode().getLeft());
                }
                if (currentNode.getNode().getRight() != null) {
                    dfsStack.push(currentNode.getNode().getRight());
                }
            }
            System.out.println("\nSUCCESS: sum of nodes in binary tree = " + sumOfNodeVals + ".");
        }
    }
}