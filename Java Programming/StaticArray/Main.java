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

        System.out.println("\narr1 -->");
        StaticArrayDS arr1 = new StaticArrayDS(1);
        arr1.printArray();

        System.out.println("\narr2 -->");
        StaticArrayDS arr2 = new StaticArrayDS(5);
        arr2.printArray();
    }
}
