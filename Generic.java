class Generic {
    public static <E> void printArray (E[] array){
        for (E element :array ){
            System.out.print(element + " ");
        }
    }
    public static void main (String [] args){
        Integer [] intarray = {1, 2, 3, 4, 5};
        String [] stringarray = {"Hello", "World", "!"};
        Double [] doublearray = {1.1, 2.2, 3.3, 4.4, 5.5};
        System.out.print("Integer Array: ");
        printArray(intarray);
        System.out.print("\nString Array: ");
        printArray(stringarray);
        System.out.print("\nDouble Array: ");
        printArray(doublearray);
        System.out.print("\n");

    }
}