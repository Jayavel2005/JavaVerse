public class Main {
    public static void main(String[] args) {
        
        // Create a new String object with the value "Robin"
        // Note: Using the new keyword explicitly creates an object in the heap.
        String name = new String("Robin");
        
        // Alternatively, create a String literal with the value "Alexander"
        // This is the preferred way because it uses the String pool.
        String name1 = "Alexander";
        
        // Print the content of the 'name' string ("Robin")
        System.out.println(name);
        
        // Convert the entire 'name' string to uppercase letters and print it
        System.out.println("Uppercase : " + name.toUpperCase());
        
        // Convert the entire 'name' string to lowercase letters and print it
        System.out.println("Lowercase : " + name.toLowerCase());
        
        // Extract the character at index 1 from 'name' (indexes start at 0)
        // For "Robin", charAt(1) returns 'o'
        System.out.println("Character by index : " + name.charAt(1));
        
        // Compare the content of 'name' ("Robin") with that of 'name1' ("Alexander")
        // equals() returns a boolean: true if both strings have the same content
        System.out.println(name.equals(name1));
        
        // Get the length of the 'name' string (number of characters)
        int length = name.length();
        System.out.println("Length: " + length);
        
        // Extract a substring from 'name' starting at index 1 up to (but not including) index 4
        // For "Robin", substring(1, 4) returns "obi"
        String sub = name.substring(1, 4);
        System.out.println("Substring (indexes 1 to 3): " + sub);
        
        // Replace all occurrences of the character 'R' with 'T' in 'name'
        // In this example, "Robin" becomes "Tobin"
        String replaced = name.replace('R', 'T');
        System.out.println("Replaced 'R' with 'T': " + replaced);
        
        // Find the index of the first occurrence of the character "o" in 'name'
        // Returns the index position of "o" or -1 if not found
        int index = name.indexOf("o");
        System.out.println("Index of 'o': " + index);
        
        // Check if 'name' contains the specified sequence "bi"
        // contains() returns true if "bi" is a substring of 'name'
        boolean contains = name.contains("bi");
        System.out.println("Contains 'bi': " + contains);
        
        // Check if 'name' starts with the prefix "Ro"
        // startsWith() returns true if the beginning of 'name' matches "Ro"
        boolean startsWith = name.startsWith("Ro");
        System.out.println("Starts with 'Ro': " + startsWith);
        
        // Check if 'name' ends with the suffix "in"
        // endsWith() returns true if the end of 'name' matches "in"
        boolean endsWith = name.endsWith("in");
        System.out.println("Ends with 'in': " + endsWith);
    }
}
