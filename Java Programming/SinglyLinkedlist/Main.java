/*
    Main.java
    - Testing class/program for SinglyLinkedlistDS.java
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("SinglyLinkedlistDS.java");
        System.out.println("-----------------------");
        
        System.out.println("\nsLl0 -->");
        System.out.println("----------");
        SinglyLinkedlistDS sLl0 = new SinglyLinkedlistDS();
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtHead(3);
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtHead(22);
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtHead(7);
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtHead(81);
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromHead();
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromHead();
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromHead();
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromHead();
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtTail(3);
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtTail(22);
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtTail(7);
        sLl0.printSinglyLinkedlist();
        sLl0.insertAtTail(81);
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromTail();
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromTail();
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromTail();
        sLl0.printSinglyLinkedlist();
        sLl0.removeFromTail();
        sLl0.printSinglyLinkedlist();
    }
}
