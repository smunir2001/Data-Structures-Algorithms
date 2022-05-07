public class Main {
    public static void main(String[] args) {
        System.out.println("ArrayStack.java");
        System.out.println("---------------");

        ArrayStackDS aS1 = new ArrayStackDS();
        aS1.printArrayStack();
        aS1.push(3);
        aS1.printArrayStack();
        aS1.push(22);
        aS1.printArrayStack();
        aS1.push(7);
        aS1.printArrayStack();
        aS1.push(81);
        aS1.printArrayStack();
        aS1.pop();
        aS1.printArrayStack();
    }
}
