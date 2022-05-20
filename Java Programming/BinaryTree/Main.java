public class Main {
    public static void main(String[] args) {
        System.out.println("BinaryTree.java");
        System.out.println("---------------\n");

        // Binary Tree (1)
        System.out.println("BINARY TREE (1)");
        BTNode a = new BTNode(1, null, null);
        BTNode b = new BTNode(2, null, null);
        BTNode c = new BTNode(3, null, null);
        BTNode d = new BTNode(4, null, null);
        BTNode e = new BTNode(5, null, null);
        BTNode f = new BTNode(6, null, null);
        a.setLeft(b);
        a.setRight(c);
        b.setLeft(d);
        b.setRight(e);
        c.setRight(f);
        // System.out.println(a.toString());
        // System.out.println(b.toString());
        // System.out.println(c.toString());
        // System.out.println(d.toString());
        // System.out.println(e.toString());
        // System.out.println(f.toString());
        BinaryTreeDS bT1 = new BinaryTreeDS(a);
        bT1.depthFirstSearch();
        bT1.breadthFirstSearch();
        bT1.doesContain(3);
        bT1.doesContain(6);
        bT1.doesContain(0);
        bT1.treeSum();
        bT1.treeMin();

        // Binary Tree (2)
        System.out.println("\n------------------------------");
        System.out.println("BINARY TREE (2)");
        BTNode a2 = new BTNode(100, null, null);
        BTNode b2 = new BTNode(23, null, null);
        BTNode c2 = new BTNode(71, null, null);
        BTNode d2 = new BTNode(46, null, null);
        BTNode e2 = new BTNode(85, null, null);
        BTNode f2 = new BTNode(19, null, null);
        a2.setLeft(b2);
        a2.setRight(f2);
        b2.setLeft(e2);
        f2.setLeft(d2);
        d2.setRight(c2);
        // System.out.println(a2.toString());
        // System.out.println(b2.toString());
        // System.out.println(c2.toString());
        // System.out.println(d2.toString());
        // System.out.println(e2.toString());
        // System.out.println(f2.toString());
        BinaryTreeDS bT2 = new BinaryTreeDS(a2);
        bT2.depthFirstSearch();
        bT2.breadthFirstSearch();
        bT2.doesContain(71);
        bT2.doesContain(19);
        bT2.doesContain(22);
        bT2.treeSum();
        bT2.treeMin();
    }
}