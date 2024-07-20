import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        // Declaration and Initialization
        int[] array = {5, 3, 8, 1, 2};

        // Accessing Elements
        System.out.println(array[0]);  // Output: 5
        System.out.println(array[1]);  // Output: 3

        // Modifying Elements
        array[0] = 10;
        System.out.println(array[0]);  // Output: 10

        // Looping Through an Array
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        for (int element : array) {
            System.out.println(element);
        }

        // Finding the Length of an Array
        int length = array.length;
        System.out.println(length);  // Output: 5

        // Copying an Array
        int[] copiedArray = new int[array.length];
        System.arraycopy(array, 0, copiedArray, 0, array.length);
        System.out.println(Arrays.toString(copiedArray));  // Output: [10, 3, 8, 1, 2]

        // Sorting an Array
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));  // Output: [1, 2, 3, 8, 10]

        // Searching an Array
        int index = Arrays.binarySearch(array, 3);
        System.out.println(index);  // Output: 2
    }
}
