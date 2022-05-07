public class Main {
    public static void main(String[] args) {
        System.out.println("LinkedlistStack.java");
        System.out.println("--------------------");

        LinkedlistStackDS lLS1 = new LinkedlistStackDS();
        lLS1.printLinkedlistStack();
        lLS1.push(3);
        lLS1.printLinkedlistStack();
        lLS1.peek();
        lLS1.push(22);
        lLS1.printLinkedlistStack();
        lLS1.peek();
        lLS1.push(7);
        lLS1.printLinkedlistStack();
        lLS1.peek();
        lLS1.push(81);
        lLS1.printLinkedlistStack();
        lLS1.peek();
        lLS1.pop();
        lLS1.printLinkedlistStack();
        lLS1.peek();
        lLS1.pop();
        lLS1.printLinkedlistStack();
        lLS1.peek();
        lLS1.pop();
        lLS1.printLinkedlistStack();
        lLS1.peek();
        lLS1.pop();
        lLS1.printLinkedlistStack();
        lLS1.peek();
    }
}
