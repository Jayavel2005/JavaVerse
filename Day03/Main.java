import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        /**
     * The main method serves as the entry point for the Java application.
     * It is executed when the program starts.
     *
     * An array in Java is a data structure that stores a fixed-size sequential collection 
     * of elements of the same type. Arrays are zero-indexed, meaning the first element 
     * is accessed with index 0. They are useful for storing multiple values in a single 
     * variable and can be of primitive or reference types.
     */
        int array [] = new int[4];
        System.out.println(Arrays.toString(array));
        // it will gives [0,0,0,0]

        String names[] = new String[3];
        System.out.println(Arrays.toString(names));
        // This will gives as [null, null, null]

        boolean [] bools = new boolean[2];
        System.out.println(Arrays.toString(bools));
        // This will gives as [false, false]

        int[] nums = {1,2,3,4};
        System.out.println(Arrays.toString(names));



    }
}