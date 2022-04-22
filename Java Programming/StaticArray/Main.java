/*
    Main.java
    - Testing class/program for StaticArrayDS.java
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("StaticArrayDS.java");
        System.out.println("------------------");
        
        System.out.println("\narr0 -->");
        StaticArrayDS arr0 = new StaticArrayDS(0);
        arr0.printArray();
        arr0.insertAtHead(3); // this will report an ERROR
        arr0.printArray();
        arr0.removeFromHead(); // this will report an ERROR
        arr0.printArray();

        System.out.println("\narr1 -->");
        StaticArrayDS arr1 = new StaticArrayDS(1);
        arr1.printArray();
        arr1.insertAtHead(3);
        arr1.printArray();
        arr1.insertAtHead(22); // this will report an ERROR
        arr1.printArray();
        arr1.removeFromHead();
        arr1.printArray();
        arr1.removeFromHead(); // this will report an ERROR
        arr1.printArray();

        System.out.println("\narr2 -->");
        StaticArrayDS arr2 = new StaticArrayDS(5);
        arr2.printArray();
        arr2.insertAtHead(3);
        arr2.printArray();
        arr2.insertAtHead(22);
        arr2.printArray();
        arr2.insertAtHead(7);
        arr2.printArray();
        arr2.insertAtHead(81);
        arr2.printArray();
        arr2.insertAtHead(146);
        arr2.printArray();
        arr2.insertAtHead(100); // this will report an ERROR
        arr2.printArray();
        arr2.removeFromHead();
        arr2.printArray();
        arr2.removeFromHead();
        arr2.printArray();
        arr2.removeFromHead();
        arr2.printArray();
        arr2.removeFromHead();
        arr2.printArray();
        arr2.removeFromHead();
        arr2.printArray();
        arr2.removeFromHead(); // this will report an ERROR
        arr2.printArray();
    }
}
