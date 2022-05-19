public class BTNode {

    int data;
    BTNode left;
    BTNode right;

    public BTNode(int data, BTNode left, BTNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setLeft(BTNode left) {
        this.left = left;
    }

    public BTNode getLeft() {
        return this.left;
    }

    public void setRight(BTNode right) {
        this.right = right;
    }

    public BTNode getRight() {
        return this.right;
    }

    @Override
    public String toString() {
        String left, right;
        if (this.getLeft() == null) {
            left = "null";
        } else {
            left = Integer.toString(this.getLeft().getData());
        }
        if (this.getRight() == null) {
            right = "null";
        } else {
            right = Integer.toString(this.getRight().getData());
        }
        String result = "node.data = " + this.data + "\nnode.left = " + left + "\nnode.right = " + right + "\n";
        return result;
    }
}