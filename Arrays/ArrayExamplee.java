package Arrays;

public class ArrayExample {

    // Declaration
    int[] aarray;

    // Constructor to initialize the array
    public ArrayExample() {
        // Initialization
        aarray = new int[5];

        // Declaration and initialization
        int[] anotherArray = {1, 2, 3, 4, 5};

        // Printing the arrays to demonstrate the initialization
        for (int i = 0; i < anotherArray.length; i++) {
            System.out.println(anotherArray[i]);
        }
    }

    public static void main(String[] args) {
        // Creating an instance of the ArrayExample class
        new ArrayExample();
    }
}
