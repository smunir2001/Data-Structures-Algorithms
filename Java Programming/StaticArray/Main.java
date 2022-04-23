/*
    Main.java
    - Testing class/program for StaticArrayDS.java
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("StaticArrayDS.java");
        System.out.println("------------------");
        
        // System.out.println("\narr0 -->");
        // StaticArrayDS arr0 = new StaticArrayDS(0);
        // arr0.printArray();
        // arr0.insertAtHead(3);
        // arr0.printArray();
        // arr0.removeFromTail();
        // arr0.printArray();

        // System.out.println("\narr1 -->");
        // StaticArrayDS arr1 = new StaticArrayDS(1);
        // arr1.printArray();
        // arr1.insertAtHead(3);
        // arr1.printArray();
        // arr1.removeFromTail();
        // arr1.printArray();

        System.out.println("\narr2 -->");
        StaticArrayDS arr2 = new StaticArrayDS(5);
        arr2.printArray();
        arr2.insertAtHead(3);
        arr2.printArray();
        arr2.insertAtHead(22);
        arr2.printArray();
        arr2.insertAtHead(7);
        arr2.printArray();
        arr2.insertAtTail(81);
        arr2.printArray();
        arr2.insertAtTail(146);
        arr2.printArray();
        arr2.insertAtHead(1000);
        arr2.printArray();
        arr2.removeFromTail();
        arr2.printArray();
        arr2.removeFromTail();
        arr2.printArray();
        arr2.removeFromTail();
        arr2.printArray();
        arr2.removeFromTail();
        arr2.printArray();
        arr2.removeFromTail();
        arr2.printArray();
        arr2.removeFromTail();
        arr2.printArray();
    }
}
