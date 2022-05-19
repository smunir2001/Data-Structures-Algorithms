public class Main {
    public static void main(String[] args) {
        System.out.println("BinaryTree.java");
        System.out.println("---------------\n");

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
        bT1.sumNodeVals();
    }
}