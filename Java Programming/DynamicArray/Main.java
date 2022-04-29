/*
    Main.java
    - Testing class/program for DynamicArrayDS.java
*/

public class Main {
    public static void main(String[] args) {
        System.out.println("DynamicArrayDS.java");
        System.out.println("------------------");
        
        System.out.println("\narr0 -->");
        DynamicArrayDS arr0 = new DynamicArrayDS(0);
        arr0.printArray();
        System.out.println("tailPointer = " + arr0.getTailPointer());
        arr0.insertAtHead(3);
        arr0.printArray();
        System.out.println("tailPointer = " + arr0.getTailPointer());
        arr0.removeFromHead();
        arr0.printArray();
        System.out.println("tailPointer = " + arr0.getTailPointer());
        arr0.insertAtTail(22);
        arr0.printArray();
        System.out.println("tailPointer = " + arr0.getTailPointer());
        arr0.removeFromTail();
        arr0.printArray();
        System.out.println("tailPointer = " + arr0.getTailPointer());

        System.out.println("\narr1 -->");
        DynamicArrayDS arr1 = new DynamicArrayDS(1);
        arr1.printArray();
        System.out.println("tailPointer = " + arr1.getTailPointer());
        arr1.insertAtHead(3);
        arr1.printArray();
        System.out.println("tailPointer = " + arr1.getTailPointer());
        arr1.removeFromTail();
        arr1.printArray();
        System.out.println("tailPointer = " + arr1.getTailPointer());

        System.out.println("\narr2 -->");
        DynamicArrayDS arr2 = new DynamicArrayDS(5);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtHead(3);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtTail(22);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtHead(7);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtTail(81);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromHead();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromTail();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromHead();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromTail();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromHead();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtHead(100);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtTail(200);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtTail(300);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtTail(400);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtTail(500);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.insertAtTail(600);
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromHead();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromTail();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromHead();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromTail();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromHead();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
        arr2.removeFromHead();
        arr2.printArray();
        System.out.println("tailPointer = " + arr2.getTailPointer());
    }
}
