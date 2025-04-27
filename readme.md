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

