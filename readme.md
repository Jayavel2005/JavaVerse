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
## Difference Between Creating Strings Using Literals and `new` Keyword

In Java, strings can be created in two ways: using string literals or the `new` keyword. Both approaches have distinct behaviors.

### 1. Using String Literals
When a string is created using a literal, it is stored in the **String Pool**. If a string with the same value already exists in the pool, the reference to the existing string is returned instead of creating a new object.

#### Example:
```java
String str1 = "Java";
String str2 = "Java";
System.out.println(str1 == str2); // Output: true (both refer to the same object in the pool)
```

### 2. Using the `new` Keyword
When a string is created using the `new` keyword, a new object is always created in the **Heap Memory**, even if an identical string exists in the String Pool.

#### Example:
```java
String str1 = new String("Java");
String str2 = new String("Java");
System.out.println(str1 == str2); // Output: false (different objects in heap memory)
```

### Key Differences
| Feature                  | String Literals                     | `new` Keyword                     |
|--------------------------|--------------------------------------|------------------------------------|
| **Memory Location**      | Stored in the String Pool.          | Stored in the Heap Memory.        |
| **Object Creation**      | Reuses existing objects if possible.| Always creates a new object.      |
| **Performance**          | Faster due to reuse.                | Slower due to new object creation.|

### Best Practice
Use string literals when possible to improve performance and reduce memory usage. Use the `new` keyword only when explicitly required to create a new object.

# Packages and Import in Java

### What are Packages?
Packages in Java are used to group related classes and interfaces together. They help organize code and avoid naming conflicts.

### Creating a Package
To create a package, use the `package` keyword at the top of your Java file.

#### Example:
```java
package com.example.myapp;

public class MyClass {
    public void displayMessage() {
        System.out.println("Hello from MyClass!");
    }
}
```

### Importing a Package
To use a class from another package, you need to import it using the `import` keyword.

#### Example:
```java
import com.example.myapp.MyClass;

public class Main {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.displayMessage();
    }
}
```

### Types of Imports
1. **Single Class Import**: Imports a specific class.
    ```java
    import java.util.ArrayList;
    ```

2. **Wildcard Import**: Imports all classes from a package.
    ```java
    import java.util.*;
    ```

### Default Package
If no package is specified, the class belongs to the default package. However, it is not recommended for large projects.

### Benefits of Using Packages
- Code organization
- Avoids class name conflicts
- Easier to locate and maintain code
- Provides access control

--- 
### Common Java Packages
1. **`java.lang`**: Contains fundamental classes like `String`, `Math`, `Object`, etc. (Imported by default).
2. **`java.util`**: Includes utility classes like `ArrayList`, `HashMap`, `Date`, etc.
3. **`java.io`**: Provides classes for input and output operations.
4. **`java.net`**: Contains classes for networking operations.
5. **`java.sql`**: Used for database connectivity.

--- 
### Example: Using Built-in Packages
```java
import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        System.out.println(list);
    }
}
```

## Reserved Keywords in Java

Java has a set of reserved keywords that have predefined meanings and cannot be used as identifiers (e.g., variable names, method names, class names).

### List of Reserved Keywords
| Category         | Keywords                                                                 |
|------------------|-------------------------------------------------------------------------|
| **Access Control** | `private`, `protected`, `public`                                       |
| **Class/Interface** | `class`, `interface`, `enum`, `extends`, `implements`                 |
| **Control Flow**   | `if`, `else`, `switch`, `case`, `default`, `for`, `while`, `do`, `break`, `continue`, `return` |
| **Exception Handling** | `try`, `catch`, `finally`, `throw`, `throws`                       |
| **Modifiers**      | `abstract`, `final`, `static`, `transient`, `volatile`, `synchronized` |
| **Primitive Types** | `byte`, `short`, `int`, `long`, `float`, `double`, `char`, `boolean`  |
| **Others**         | `void`, `null`, `true`, `false`, `this`, `super`, `new`, `import`, `package`, `instanceof`, `assert`, `native`, `strictfp`, `goto`, `const` |

### Example of Reserved Keywords in Use
```java
public class Example {
    private int number = 10; // 'private' is a reserved keyword

    public static void main(String[] args) {
        if (true) { // 'if' is a reserved keyword
            System.out.println("Hello, Java!");
        }
    }
}
```

### Notes
- Reserved keywords are case-sensitive (`public` is valid, but `Public` is not a keyword).
- Avoid using these keywords for naming variables, methods, or classes to prevent compilation errors.
- Some keywords like `goto` and `const` are reserved but not used in Java.

--- 
For a complete list of keywords, refer to the [official Java documentation](https://docs.oracle.com/javase/tutorial/java/nutsandbolts/_keywords.html).


## Operators in Java

Operators in Java are special symbols or keywords used to perform operations on variables and values.

### Types of Operators

1. **Arithmetic Operators**
    Perform basic mathematical operations.
    | Operator | Description       | Example                |
    |----------|-------------------|------------------------|
    | `+`      | Addition          | `int sum = a + b;`     |
    | `-`      | Subtraction       | `int diff = a - b;`    |
    | `*`      | Multiplication    | `int prod = a * b;`    |
    | `/`      | Division          | `int div = a / b;`     |
    | `%`      | Modulus (remainder) | `int rem = a % b;`   |

    #### Example:
    ```java
    int a = 10, b = 3;
    System.out.println(a + b); // Output: 13
    System.out.println(a % b); // Output: 1
    ```

2. **Relational (Comparison) Operators**
    Compare two values and return a boolean result.
    | Operator | Description          | Example            |
    |----------|----------------------|--------------------|
    | `==`     | Equal to             | `a == b`           |
    | `!=`     | Not equal to         | `a != b`           |
    | `>`      | Greater than         | `a > b`            |
    | `<`      | Less than            | `a < b`            |
    | `>=`     | Greater than or equal to | `a >= b`       |
    | `<=`     | Less than or equal to   | `a <= b`       |

    #### Example:
    ```java
    int a = 5, b = 10;
    System.out.println(a > b); // Output: false
    System.out.println(a <= b); // Output: true
    ```

3. **Logical Operators**
    Used to combine multiple boolean expressions.
    | Operator | Description       | Example            |
    |----------|-------------------|--------------------|
    | `&&`     | Logical AND       | `a > 5 && b < 10`  |
    | `||`     | Logical OR        | `a > 5 || b < 10`  |
    | `!`      | Logical NOT       | `!(a > 5)`         |

    #### Example:
    ```java
    boolean a = true, b = false;
    System.out.println(a && b); // Output: false
    System.out.println(a || b); // Output: true
    ```


4. **Assignment Operators**
    Assign values to variables.
    | Operator | Description       | Example            |
    |----------|-------------------|--------------------|
    | `=`      | Assign            | `a = 10;`          |
    | `+=`     | Add and assign    | `a += 5;`          |
    | `-=`     | Subtract and assign | `a -= 5;`        |
    | `*=`     | Multiply and assign | `a *= 5;`        |
    | `/=`     | Divide and assign | `a /= 5;`          |
    | `%=`     | Modulus and assign | `a %= 5;`        |

    #### Example:
    ```java
    int a = 10;
    a += 5; // a = a + 5
    System.out.println(a); // Output: 15
    ```

5. **Unary Operators**
    Operate on a single operand.
    | Operator | Description       | Example            |
    |----------|-------------------|--------------------|
    | `+`      | Unary plus        | `+a`               |
    | `-`      | Unary minus       | `-a`               |
    | `++`     | Increment         | `a++` or `++a`     |
    | `--`     | Decrement         | `a--` or `--a`     |
    | `!`      | Logical NOT       | `!a`               |

    #### Example:
    ```java
    int a = 5;
    System.out.println(++a); // Output: 6
    System.out.println(a--); // Output: 4
    ```

6. **Bitwise Operators**
    Perform operations on bits.
    | Operator | Description       | Example            |
    |----------|-------------------|--------------------|
    | `&`      | Bitwise AND       | `a & b`            |
    | `|`      | Bitwise OR        | `a | b`            |
    | `^`      | Bitwise XOR       | `a ^ b`            |
    | `~`      | Bitwise Complement | `~a`             |
    | `<<`     | Left shift        | `a << 2`           |
    | `>>`     | Right shift       | `a >> 2`           |

    ### Truth Tables for Bitwise Operators

    Bitwise operators operate on binary representations of integers. Below are the truth tables for common bitwise operators:

    #### 1. **Bitwise AND (`&`)**
    The result is `1` if both bits are `1`, otherwise `0`.

    | A | B | A & B |
    |---|---|-------|
    | 0 | 0 |   0   |
    | 0 | 1 |   0   |
    | 1 | 0 |   0   |
    | 1 | 1 |   1   |

    #### 2. **Bitwise OR (`|`)**
    The result is `1` if at least one bit is `1`.

    | A | B | A & B |
    |---|---|-------|
    | 0 | 0 |   0   |
    | 0 | 1 |   1   |
    | 1 | 0 |   1   |
    | 1 | 1 |   1   |

    

    #### 3. **Bitwise XOR (`^`)**
    The result is `1` if the bits are different, otherwise `0`.

    | A | B | A ^ B |
    |---|---|-------|
    | 0 | 0 |   0   |
    | 0 | 1 |   1   |
    | 1 | 0 |   1   |
    | 1 | 1 |   0   |

    #### 4. **Bitwise NOT (`~`)**
    The result is the complement of the bit (flips `0` to `1` and `1` to `0`).

    | A | ~A |
    |---|----|
    | 0 |  1 |
    | 1 |  0 |

    #### 5. **Left Shift (`<<`)**
    Shifts bits to the left, filling with `0` on the right.

    | A (Binary) | A << 1 (Binary) | A << 2 (Binary) |
    |------------|------------------|------------------|
    | 0001       | 0010             | 0100             |
    | 0010       | 0100             | 1000             |

    #### 6. **Right Shift (`>>`)**
    Shifts bits to the right, filling with the sign bit (for signed numbers).

    | A (Binary) | A >> 1 (Binary) | A >> 2 (Binary) |
    |------------|------------------|------------------|
    | 0100       | 0010             | 0001             |
    | 1000       | 1100 (signed)    | 1110 (signed)    |

    These truth tables help visualize how bitwise operations work at the binary level.

---

## Conditional Statements in Java

1. **`if` Statement**
    Executes a block of code if the condition is true.
    ```java
    if (condition) {
         // Code to execute
    }
    ```

    #### Example:
    ```java
    int age = 18;
    if (age >= 18) {
         System.out.println("You are an adult.");
    }
    ```

2. **`if-else` Statement**
    Executes one block of code if the condition is true, otherwise executes another block.
    ```java
    if (condition) {
         // Code if true
    } else {
         // Code if false
    }
    ```

    #### Example:
    ```java
    int age = 16;
    if (age >= 18) {
         System.out.println("You are an adult.");
    } else {
         System.out.println("You are a minor.");
    }
    ```

3. **`else if` Ladder**
    Tests multiple conditions sequentially.
    ```java
    if (condition1) {
         // Code if condition1 is true
    } else if (condition2) {
         // Code if condition2 is true
    } else {
         // Code if none of the conditions are true
    }
    ```

    #### Example:
    ```java
    int marks = 85;
    if (marks >= 90) {
         System.out.println("Grade: A");
    } else if (marks >= 75) {
         System.out.println("Grade: B");
    } else {
         System.out.println("Grade: C");
    }
    ```

4. **`switch` Statement**
    Tests a variable against multiple cases.
    ```java
    switch (variable) {
         case value1:
              // Code for value1
              break;
         case value2:
              // Code for value2
              break;
         default:
              // Code if no case matches
    }
    ```

    #### Example:
    ```java
    int day = 3;
    switch (day) {
         case 1:
              System.out.println("Monday");
              break;
         case 2:
              System.out.println("Tuesday");
              break;
         case 3:
              System.out.println("Wednesday");
              break;
         default:
              System.out.println("Invalid day");
    }
    ```

---

## Math Class in Java

The `Math` class in Java provides methods for performing mathematical operations.

### Commonly Used Methods

1. **`Math.abs()`**
    Returns the absolute value of a number.
    ```java
    System.out.println(Math.abs(-10)); // Output: 10
    ```

2. **`Math.max()` and `Math.min()`**
    Returns the maximum or minimum of two numbers.
    ```java
    System.out.println(Math.max(10, 20)); // Output: 20
    System.out.println(Math.min(10, 20)); // Output: 10
    ```

3. **`Math.pow()`**
    Returns the value of the first argument raised to the power of the second argument.
    ```java
    System.out.println(Math.pow(2, 3)); // Output: 8.0
    ```

4. **`Math.sqrt()`**
    Returns the square root of a number.
    ```java
    System.out.println(Math.sqrt(16)); // Output: 4.0
    ```

5. **`Math.random()`**
    Returns a random number between 0.0 and 1.0.
    ```java
    System.out.println(Math.random());
    ```

6. **`Math.round()`**
    Rounds a floating-point number to the nearest integer.
    ```java
    System.out.println(Math.round(4.6)); // Output: 5
    ```

7. **`Math.ceil()` and `Math.floor()`**
    - `ceil()`: Rounds up to the nearest integer.
    - `floor()`: Rounds down to the nearest integer.
    ```java
    System.out.println(Math.ceil(4.2)); // Output: 5.0
    System.out.println(Math.floor(4.8)); // Output: 4.0
    ```

8. **`Math.log()`**
    Returns the natural logarithm of a number.
    ```java
    System.out.println(Math.log(10)); // Output: 2.302585...
    ```

9. **`Math.sin()`, `Math.cos()`, `Math.tan()`**
    Returns the trigonometric sine, cosine, or tangent of an angle (in radians).
    ```java
    System.out.println(Math.sin(Math.PI / 2)); // Output: 1.0
    ```

10. **`Math.toRadians()` and `Math.toDegrees()`**
     Converts angles between degrees and radians.
     ```java
     System.out.println(Math.toRadians(180)); // Output: 3.14159...
     System.out.println(Math.toDegrees(Math.PI)); // Output: 180.0
     ```

--- 
These operators, conditional statements, and the `Math` class are essential tools for solving problems in Java programming.