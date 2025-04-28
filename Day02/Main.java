public class Main {
    public static void main(String[] args) {
        
        // // Create a new String object with the value "Robin"
        // // Note: Using the new keyword explicitly creates an object in the heap.
        // String name = new String("Robin");
        
        // // Alternatively, create a String literal with the value "Alexander"
        // // This is the preferred way because it uses the String pool.
        // String name1 = "Alexander";
        
        // // Print the content of the 'name' string ("Robin")
        // System.out.println(name);
        
        // // Convert the entire 'name' string to uppercase letters and print it
        // System.out.println("Uppercase : " + name.toUpperCase());
        
        // // Convert the entire 'name' string to lowercase letters and print it
        // System.out.println("Lowercase : " + name.toLowerCase());
        
        // // Extract the character at index 1 from 'name' (indexes start at 0)
        // // For "Robin", charAt(1) returns 'o'
        // System.out.println("Character by index : " + name.charAt(1));
        
        // // Compare the content of 'name' ("Robin") with that of 'name1' ("Alexander")
        // // equals() returns a boolean: true if both strings have the same content
        // System.out.println(name.equals(name1));
        
        // // Get the length of the 'name' string (number of characters)
        // int length = name.length();
        // System.out.println("Length: " + length);
        
        // // Extract a substring from 'name' starting at index 1 up to (but not including) index 4
        // // For "Robin", substring(1, 4) returns "obi"
        // String sub = name.substring(1, 4);
        // System.out.println("Substring (indexes 1 to 3): " + sub);
        
        // // Replace all occurrences of the character 'R' with 'T' in 'name'
        // // In this example, "Robin" becomes "Tobin"
        // String replaced = name.replace('R', 'T');
        // System.out.println("Replaced 'R' with 'T': " + replaced);
        
        // // Find the index of the first occurrence of the character "o" in 'name'
        // // Returns the index position of "o" or -1 if not found
        // int index = name.indexOf("o");
        // System.out.println("Index of 'o': " + index);
        
        // // Check if 'name' contains the specified sequence "bi"
        // // contains() returns true if "bi" is a substring of 'name'
        // boolean contains = name.contains("bi");
        // System.out.println("Contains 'bi': " + contains);
        
        // // Check if 'name' starts with the prefix "Ro"
        // // startsWith() returns true if the beginning of 'name' matches "Ro"
        // boolean startsWith = name.startsWith("Ro");
        // System.out.println("Starts with 'Ro': " + startsWith);
        
        // // Check if 'name' ends with the suffix "in"
        // // endsWith() returns true if the end of 'name' matches "in"
        // boolean endsWith = name.endsWith("in");
        // System.out.println("Ends with 'in': " + endsWith);


        // Operators
        // Operators are the symbols that can perform operations on variables and values
        /*
         * Arithmetic Operator
         * Assginment Operator
         * Relation Operator (or) Comparison operator
         * Logical Operator
         * Bitwise Operator
         * Unary Operator
         * Ternary Operator
         * Instance of Operator
         */

        //  Arithmetic Operators
        int ten = 10;
        int two = 2;
        int addition = ten + two;
        int subtraction = ten - two;
        int multiplication = ten * two;
        int division = ten * two;
        int remainder = ten % two;
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        System.out.println("Division: " + division);
        System.out.println("Remainder: " + remainder);


        // Comparison Operators
        int five = 5;
        int eight = 8;

        // Check if two numbers are equal
        System.out.println("Is five equal to eight? " + (five == eight)); // false

        // Check if two numbers are not equal
        System.out.println("Is five not equal to eight? " + (five != eight)); // true

        // Check if one number is greater than the other
        System.out.println("Is five greater than eight? " + (five > eight)); // false

        // Check if one number is less than the other
        System.out.println("Is five less than eight? " + (five < eight)); // true

        // Check if one number is greater than or equal to the other
        System.out.println("Is five greater than or equal to eight? " + (five>=eight));

        // Check if one number is less than or equal to the other
        System.out.println("Is five less than or equal to eight? " + (five<=eight));


        // Math Class
        // Find the maximum of two numbers
        int max = Math.max(ten, two);
        System.out.println("Maximum: " + max);

        // Find the minimum of two numbers
        int min = Math.min(ten, two);
        System.out.println("Minimum: " + min);

        // Calculate the square root of a number
        double squareRoot = Math.sqrt(ten);
        System.out.println("Square Root of 10: " + squareRoot);

        // Calculate the power of a number (10^2)
        double power = Math.pow(ten, two);
        System.out.println("10 to the power of 2: " + power);

        // Generate a random number between 0.0 (inclusive) and 1.0 (exclusive)
        double random = Math.random();
        System.out.println("Random number: " + random);

        // Find the absolute value of a number
        int negativeNumber = -10;
        int absoluteValue = Math.abs(negativeNumber);
        System.out.println("Absolute value of -10: " + absoluteValue);

        // Round a floating-point number to the nearest integer
        double number = 10.6;
        long rounded = Math.round(number);
        System.out.println("Rounded value of 10.6: " + rounded);

    }
}
