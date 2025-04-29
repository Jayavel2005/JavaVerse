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

        // Accessing and modifying array elements using indexes
        nums[0] = 10; // Changing the first element to 10
        System.out.println("Updated nums array: " + Arrays.toString(nums));

        // Accessing elements by index
        System.out.println("First element in nums: " + nums[0]);
        System.out.println("Second element in nums: " + nums[1]);

        // Iterating through the array using a for loop
        System.out.println("Iterating through nums array:");
        for (int i = 0; i < nums.length; i++) {
            System.out.println("Element at index " + i + ": " + nums[i]);
        }

        // Iterating through the array using a for-each loop
        System.out.println("Iterating through nums array using for-each loop:");
        for (int num : nums) {
            System.out.println(num);
        }

        String [] personNames = {"Anna","Ali", "Bob", "Alice" };
        for (String name : personNames) {
            if (name.equals("Bob")) {
                break;                  // This will break the loop if name is equal to Bob
            }
            System.out.print(name + " ");  // This print statement will print the values **OUTPUT* -> Anna Ali
        }
        System.out.println("---------------------------------");
        for (String name : personNames) {
            if (name.equals("Bob")) {
                continue;                  // This will skip the iteration  if name is equal to Bob
            }
            System.out.print(name + " ");  // This print statement will print the values **OUTPUT* -> Anna Ali Alice
        }


    }
}