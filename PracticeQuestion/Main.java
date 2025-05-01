import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        // This program checks if a number is positive, negative or zero.
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number: ");
        // int number = scanner.nextInt();
        // if (number > 0) {
        //     System.out.println("The number " + number + " is Positive" );
        // } else if(number < 0){
        //     System.out.println("The number " + number + " is Negative" );
        // } else {
        //     System.out.println("The number " + number + " is Zero" );
        // }
        
        // Question 2: This program checks if a number is even or odd.
        // System.out.print("Enter the number: ");
        // int number = scanner.nextInt();
        // if(number % 2 == 0) {
        //     System.out.println("It is an Even Number!");
        // }else {
        //     System.out.println("It is an Odd Number!");
        // }

        // Question 3: Implement a program to find the greater of two numbers
        // System.out.print("Enter the first Number: ");
        // int number1 = scanner.nextInt();
        // System.out.print("Enter the second Number: ");
        // int number2 = scanner.nextInt();
        // if (number1 > number2) {
        //     System.out.println("The Greater number is number 1: " + number1 );
        // } else if(number1 < number2){
        //     System.out.println("The Greater Number is number 2: " + number2);   
        // }else {
        //     System.out.println("Both Numbers are Equal");
        // }

        // Question 4: Write code to print numbers from 1 to N using a loop
        // System.out.print("Enter the N th term: ");
        // int number = scanner.nextInt();
        // for (int i = 1; i <= number; i++) {
        //     System.out.println(i);
        // }

        // Question 5: Develop a program to calculate the sum of first N natural numbers
        System.out.print("Enter the N th value: ");
        int n = scanner.nextInt();
        int total =(int)(n * (n + 1)) / 2;
        System.out.println("Sum of N Natural Numbers: " + total);
    }
}
