# JavaVerse

## Why Java is Platform Independent
Java’s platform independence comes from its "Write Once, Run Anywhere" (WORA) nature. Java code is compiled into platform-neutral bytecode which is executed by a Java Virtual Machine (JVM).

### Example: Running on Different Platforms
Compile your code:
```bash
javac HelloWorld.java
```
Run on Windows, Linux, or macOS (provided a JVM is installed):
```bash
java HelloWorld
```

---

## Variables in Java
Variables store data values. They must be declared with a specific type before use.

### Syntax:
```java
type variableName = value;
```

### Examples:
1. Declaring an integer variable:
    ```java
    int age = 25;
    ```
2. Declaring a String variable:
    ```java
    String name = "John";
    ```
3. Declaring multiple variables:
    ```java
    double salary = 50000.50;
    char grade = 'A';
    ```

---

## Data Types in Java
Java has two main categories of data types:

### 1. Primitive Data Types
These include:
- `byte`, `short`, `int`, `long`
- `float`, `double`
- `char`
- `boolean`

#### Examples:
```java
int number = 10;     // integer type
double price = 19.99; // floating point type
char letter = 'J';   // character type
boolean flag = true; // boolean type
```

### 2. Reference Data Types
These refer to objects and include:
- Classes
- Interfaces
- Arrays

#### Examples:
```java
String text = "Hello, World!";  // Class instance
int[] numbers = {1, 2, 3, 4};    // Array instance
```

---

## Naming Variables
Variable names must start with a letter, `$`, or `_` and are case-sensitive.

### Valid and Invalid Examples:
```java
int studentAge = 20;     // Correct
int _counter = 100;      // Correct
int $amount = 50;        // Correct
int 1stNumber = 5;       // Incorrect: begins with a digit
```

## Variable Naming Conventions

Different naming conventions help distinguish the purpose of identifiers in Java.

### Camel Case
Used for variables and methods. The first letter is lowercase, and each subsequent word starts with an uppercase letter.
Example:
```java
int studentAge = 20;
String firstName = "Jane";
```

### Pascal Case
Used for class names and constructors. Each word starts with an uppercase letter.
Example:
```java
public class StudentGrade {
    public StudentGrade() { }
}
```

### Snake Case
Less common in Java, snake_case separates words with underscores.
Example:
```java
int student_age = 20;
```

### SCREAMING_SNAKE_CASE
Used for constants. All letters are uppercase with words separated by underscores.
Example:
```java
public static final int MAX_SCORE = 100;
```

---

## Difference Between Primitive and Reference Data Types
| Feature                   | Primitive Data Types          | Reference Data Types          |
|---------------------------|-------------------------------|-------------------------------|
| **Definition**            | Store simple values directly. | Store references to objects.  |
| **Memory Allocation**     | Fixed size in memory.         | Dynamic memory allocation.    |
| **Examples**              | `int`, `float`, `boolean`     | `String`, `Array`, `Object`    |

### Examples:
```java
int x = 10;  // primitive variable
String str = "Java";  // reference variable
```

---

# 🧠 Memory Allocation in Java

## 📦 Primitive Data Types
Primitive types are stored in stack memory.

### Examples:
```java
int x = 10;        // Directly stored in stack as [10]
float f = 3.14F;   // Directly stored in stack as [3.14]
boolean b = true;  // Directly stored in stack as [true]
char c = 'A';      // Directly stored in stack as ['A']
```

---

## 🗃️ Reference Data Types
Reference types store memory addresses in the stack with the object in heap memory.

### Examples:
```java
String str = "Java";           // 'str' holds a reference in stack, "Java" in heap
Person person = new Person();  // 'person' holds a reference in stack, Person object in heap
int[] arr = new int[5];        // 'arr' holds a reference in stack, array of integers in heap
```

---

## 🧩 Diagram Representation

### Memory Layout Example:
```text
+-----------------+            +------------------------+
|  Stack Memory   |            |      Heap Memory       |
|-----------------|            |------------------------|
| int x = 10      |            |                        |
| float f = 3.14  |            |                        |
| boolean b = true|            |                        |
| String str = Ref| ---> Ref ->| "Java"                 |
+-----------------+            +------------------------+

+-----------------+            +------------------------+
|  Stack Memory   |            |      Heap Memory       |
|-----------------|            |------------------------|
| String listRef  | ---> Ref ->| ["Java", "Python"]     |
| Person pRef     | ---> Ref ->| Person object (fields) |
+-----------------+            +------------------------+
```

## Strings in Java

A `String` in Java is a sequence of characters. Strings are immutable, meaning their values cannot be changed once created. They are widely used for storing and manipulating text.

### Creating Strings

1. Using string literals:
    ```java
    String greeting = "Hello, World!";
    ```

2. Using the `new` keyword:
    ```java
    String message = new String("Welcome to Java!");
    ```

---

### Examples of Strings

1. Concatenating strings:
    ```java
    String firstName = "John";
    String lastName = "Doe";
    String fullName = firstName + " " + lastName;
    System.out.println(fullName); // Output: John Doe
    ```

2. Comparing strings:
    ```java
    String str1 = "Java";
    String str2 = "Java";
    System.out.println(str1.equals(str2)); // Output: true
    ```

3. String immutability:
    ```java
    String original = "Hello";
    String modified = original.concat(", World!");
    System.out.println(original);  // Output: Hello
    System.out.println(modified);  // Output: Hello, World!
    ```

---

### Most Useful String Functions

1. **`length()`**: Returns the length of the string.
    ```java
    String text = "Java";
    System.out.println(text.length()); // Output: 4
    ```

2. **`charAt(int index)`**: Returns the character at the specified index.
    ```java
    String text = "Java";
    System.out.println(text.charAt(2)); // Output: v
    ```

3. **`substring(int beginIndex, int endIndex)`**: Extracts a portion of the string.
    ```java
    String text = "Java Programming";
    System.out.println(text.substring(0, 4)); // Output: Java
    ```

4. **`toUpperCase()` and `toLowerCase()`**: Converts the string to uppercase or lowercase.
    ```java
    String text = "Java";
    System.out.println(text.toUpperCase()); // Output: JAVA
    System.out.println(text.toLowerCase()); // Output: java
    ```

5. **`trim()`**: Removes leading and trailing spaces.
    ```java
    String text = "  Java  ";
    System.out.println(text.trim()); // Output: Java
    ```

6. **`replace(char oldChar, char newChar)`**: Replaces occurrences of a character.
    ```java
    String text = "Java";
    System.out.println(text.replace('a', 'o')); // Output: Jovo
    ```

7. **`contains(CharSequence sequence)`**: Checks if the string contains a sequence of characters.
    ```java
    String text = "Java Programming";
    System.out.println(text.contains("Program")); // Output: true
    ```

8. **`split(String regex)`**: Splits the string into an array based on a delimiter.
    ```java
    String text = "Java,Python,C++";
    String[] languages = text.split(",");
    for (String lang : languages) {
        System.out.println(lang);
    }
    // Output:
    // Java
    // Python
    // C++
    ```

9. **`equals(String anotherString)`**: Compares two strings for equality.
    ```java
    String str1 = "Java";
    String str2 = "java";
    System.out.println(str1.equals(str2)); // Output: false
    ```

10. **`isEmpty()`**: Checks if the string is empty.
    ```java
    String text = "";
    System.out.println(text.isEmpty()); // Output: true
    ```

---