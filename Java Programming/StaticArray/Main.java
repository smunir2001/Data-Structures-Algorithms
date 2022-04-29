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
        StaticArrayDS arr1 = new StaticArrayDS(1);
        arr1.printArray();
        System.out.println("tailPointer = " + arr1.getTailPointer());
        arr1.insertAtHead(3);
        arr1.printArray();
        System.out.println("tailPointer = " + arr1.getTailPointer());
        arr1.removeFromTail();
        arr1.printArray();
        System.out.println("tailPointer = " + arr1.getTailPointer());

        System.out.println("\narr2 -->");
        StaticArrayDS arr2 = new StaticArrayDS(5);
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
    }
}
