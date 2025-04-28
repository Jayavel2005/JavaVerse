// package JavaVerse.Day02;

public class Conditionals {
    public static void main(String[] args) {
        // Define the age to be validated
        int age = 20;

        // Check if the age is 18 or above
        if (age >= 18) {
            // If age is 18 or above, the person is eligible to vote
            System.out.println("You are eligible to vote.");
        } else {
            // If age is below 18, the person is not eligible to vote
            System.out.println("You are not eligible to vote.");
        }

        // Example of if-else if-else
        // Define the marks obtained by the student
        int marks = 85;

        // Check if marks are 90 or above
        if (marks >= 90) {
            // If marks are 90 or above, assign Grade A
            System.out.println("Grade: A");
        } 
        // Check if marks are 75 or above but less than 90
        else if (marks >= 75) {
            // If marks are between 75 and 89, assign Grade B
            System.out.println("Grade: B");
        } 
        // Check if marks are 50 or above but less than 75
        else if (marks >= 50) {
            // If marks are between 50 and 74, assign Grade C
            System.out.println("Grade: C");
        } 
        // If marks are below 50
        else {
            // Assign Grade F for marks below 50
            System.out.println("Grade: F");
        }

        // Example of using a ternary operator
        // Define a number to check if it's even or odd
        int number = 10;

        // Use a ternary operator to determine if the number is even or odd
        // The condition (number % 2 == 0) checks if the number is divisible by 2
        // If true, it assigns "Even" to the result; otherwise, it assigns "Odd"
        String result = (number % 2 == 0) ? "Even" : "Odd";

        // Print the result
        System.out.println("The number " + number + " is " + result + ".");

        // Example of a switch statement
        // Define a day number (1 for Monday, 2 for Tuesday, etc.)
        int day = 3;

        // Use a switch statement to determine the day of the week
        switch (day) {
            case 1:
            // If day is 1, it's Monday
            System.out.println("Monday");
            break;
            case 2:
            // If day is 2, it's Tuesday
            System.out.println("Tuesday");
            break;
            case 3:
            // If day is 3, it's Wednesday
            System.out.println("Wednesday");
            break;
            case 4:
            // If day is 4, it's Thursday
            System.out.println("Thursday");
            break;
            case 5:
            // If day is 5, it's Friday
            System.out.println("Friday");
            break;
            case 6:
            // If day is 6, it's Saturday
            System.out.println("Saturday");
            break;
            case 7:
            // If day is 7, it's Sunday
            System.out.println("Sunday");
            break;
            default:
            // If the day number is not between 1 and 7
            System.out.println("Invalid day number");
        }
    }
}
