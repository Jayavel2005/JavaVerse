
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
    // This is single line comment

    /*
        This is multi line comment
    */
    // System.out.println("Hello this is first Java App!");

    // Variabes and Data Types
    // Variables -> Just like a container to store the data
    // Data Type -> The type of the data 

    // Primitive data types
    
    // Stores whole numbers
    byte theByte = 123;    // -128 to 127
    short theShort = 3_334;  //-32768 to 32767  using underscores for better readablity in number systems
    int theInt = 56;
    long theLong = 463435435342364643l;

    // Stores decimal numbers

    float theFloat = 5.477777777777777777777777777777777F;
    double theDouble = 5.333;
    
    // Boolean 

    boolean theBool = true;

    char theChar = 65; 
    System.out.println("byte: " + theByte);
    System.out.println("short: " + theShort);
    System.out.println("int: " + theInt);
    System.out.println("long: " + theLong);
    System.out.println("float: " + theFloat);
    System.out.println("double: " + theDouble);
    System.out.println("boolean: " + theBool);
    System.out.println("char: " + theChar);


    // Refernced Type

    String name = "Jayavel";
    System.out.println(name.toUpperCase());

    LocalDate date = LocalDate.now();
    System.out.println(date.getMonthValue());

    Person alex = new Person("Alex");
    Person mariam = alex;
    System.out.println(alex.name  + " " + mariam.name);
    mariam.name = "Vaishnav";
    System.out.println(alex.name  + " " + mariam.name);



    }

    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }
}
