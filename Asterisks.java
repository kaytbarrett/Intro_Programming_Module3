/**
 * Katherine (Katie) Barrett
 * EN.605.201.81.SU24
 * Assignment #3 (Part 1)
 * 
 * References used for this assignment: 
 * Module 2 Assignment (to reference proper Java syntax and initialization/use of the Scanner)
 */

 import java.util.Scanner;

 public class Asterisks 
 {
    public static void main ( String [] args )
    {
        // Define and initialize variables for values to be input
        int numAsterisks;
        int choice;

        // Initialize scanner for user input
        Scanner input = new Scanner(System.in);

        // Prompt user for number of asterisks and save the value in the numAsterisks variable
        System.out.println("Please enter the number of asterisks you want output: ");
        numAsterisks = input.nextInt();

        // Prompt user for a selection of 1 or 2 and save the value in the choice variable
        System.out.println("Please choose a number, either 1 or 2: ");
        choice = input.nextInt();
        System.out.println();

        // Close the scanner
        input.close();


        if (choice == 1)
        // Use nested for loops to iterate in ascending order
        {
            for(int i = 0; i < numAsterisks; i++)
            {
                for(int j = 0; j < i; j++)
                {
                    // Print out correct number of asterisks on one line
                    System.out.print('*');
                }
                // Print out a new line
                System.out.println();
        } 
        } else if ( choice == 2)
        // Use nested for loops to iterate in descending order 
        {
            for (int i = numAsterisks; i > 0; i--)
            {
                for(int j = 0; j < i; j++)
                {
                    // Print out correct number of asterisks on one line
                    System.out.print('*');
                }
                // Print out a new line
                System.out.println();
            }
        } else 
        // If neither 1 nor 2 is entered as the choice, print out an error stating that the input is invalid.
        {
            System.out.println("Error: Invalid input.");
        }
    }
 }